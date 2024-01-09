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
    public List<Integer> inorderTraversal(TreeNode node) {
            List<Integer> list1 = new ArrayList<>();
            inorder(list1,node);
            return list1;

    }
    public void inorder(List<Integer> list1,TreeNode node){
        if(node==null){
            return ;
        }
        inorder(list1,node.left);
        list1.add(node.val);
        inorder(list1,node.right);
    }
}