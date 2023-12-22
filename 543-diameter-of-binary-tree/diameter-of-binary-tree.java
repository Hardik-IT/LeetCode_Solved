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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        int dia = lheight + rheight + 1;
        diameter = Math.max(diameter,dia); 
        return (Math.max(lheight,rheight)+1);
    }
}