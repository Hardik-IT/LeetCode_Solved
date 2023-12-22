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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
            (level(root,xx,0) == level(root,yy,0)) && (!isSibling(root,xx,yy))
        );
    }

    public TreeNode findNode(TreeNode node, int t){
        if(node == null){
            return node;
        }
        if(node.val == t){
            return node;
        }
        TreeNode n = findNode(node.left,t);
        if(n!=null){
            return n;
        }
        return findNode(node.right,t);
    }
     public int level(TreeNode node,TreeNode ss, int clevel){
        if(node == null){
            return 0;
        }
        if(node == ss){
            return clevel;
        }
        int level = level(node.left,ss,clevel+1);
        if(level!=0){
            return level;
        }
        return level(node.right,ss,clevel+1);

    }
    public boolean isSibling(TreeNode node,TreeNode xnode,TreeNode ynode){
        if(node == null){
            return false;
        }

        return (
            (node.left== xnode && node.right == ynode) || (node.left== ynode && node.right == xnode) || isSibling(node.left,xnode,ynode) || isSibling(node.right,xnode,ynode) 
        );
    }
}