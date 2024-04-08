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
    boolean firstNode = true;
    boolean ans = true;
    TreeNode prevNode = null;
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        } 
        helper(root);
        return ans;
    }
    private void helper(TreeNode root){
        if(root==null){
            return;
        } 
        helper(root.left);
        if(firstNode == true){
            firstNode = false;
        }else if(prevNode.val >= root.val){
            ans = false;
            return;
        }
        prevNode = root;
        helper(root.right);
    }
}