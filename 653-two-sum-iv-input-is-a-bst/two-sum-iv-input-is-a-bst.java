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
     public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        return helper(root,k,hashSet);
    }

    private boolean helper(TreeNode node, int k, HashSet<Integer> hashSet) {

        if (node == null){
            return false;
        }

        if(hashSet.contains(k-node.val)){
            return true;
        }

        hashSet.add(node.val);
        return helper(node.left,k,hashSet) || helper(node.right,k,hashSet);
    }
}