/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // int count=0;
    // public int kthSmallest(TreeNode root, int k) {
    //     return  helper(root,k).val;
    // }
    // public TreeNode helper(TreeNode root,int k){
    //     if(root == null){
    //         return null;
    //     }
    //     TreeNode left = helper(root.left,k);
    //     if(left!= null){
    //         return left;
    //     }
    //     count++;
    //     if(count == k){
    //         return root;
    //     }
    //     return helper(root.right,k);
    // }
     
     
     /*   public int kthSmallest(TreeNode root, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root,minHeap,k);

        //remove k elements
        int ans=0;
        for(int i=0;i<k;i++){
            ans = minHeap.poll();
        }
        return ans;
    }

    private void helper(TreeNode node, PriorityQueue<Integer> minHeap, int k) {
        if (node==null){
            return;
        }
        helper(node.left,minHeap,k);
            minHeap.add(node.val);
        helper(node.right,minHeap,k);
    }
    */

        private int k=0;
    private int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        helper(root);

        //remove k elements
        return ans;
    }

    private void helper(TreeNode node) {
        if (node==null){
            return;
        }

        helper(node.left);
        k--;
        if(k==0){
            ans = node.val;
            return;
        }

        helper(node.right);
    }
}