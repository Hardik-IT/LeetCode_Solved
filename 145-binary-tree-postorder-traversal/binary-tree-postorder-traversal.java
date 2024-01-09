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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        postorder(list1,root);
        return list1;    
    }
    public void postorder(List<Integer> list1,TreeNode node){
        if(node==null){
            return ;
        }
        postorder(list1,node.left);
        postorder(list1,node.right);
        list1.add(node.val);
    }

    
}