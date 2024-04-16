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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if(depth==1){
                TreeNode newNode = new TreeNode(val);
                newNode.left = root;
                return newNode;
            }
            return helper(root,val,depth,1);
    }
    private TreeNode helper(TreeNode node,int val,int depth,int curr){
        if(node==null)
            return null;
        if(curr == depth-1){
            TreeNode leftT = node.left;
            TreeNode rightT = node.right;
            node.left = new TreeNode(val);
            node.right = new TreeNode(val);
            node.left.left =leftT;
            node.right.right = rightT;
            return node;
        }
        node.left = helper(node.left,val,depth,curr+1);
        node.right = helper(node.right,val,depth,curr+1);
        return node;
    }
}