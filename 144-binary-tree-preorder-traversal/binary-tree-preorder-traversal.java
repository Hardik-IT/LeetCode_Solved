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
    public List<Integer> preorderTraversal(TreeNode node) {
            List<Integer> list1 = new ArrayList<>();
            preorder(list1,node);
            return list1;

    }
    public void preorder(List<Integer> list1,TreeNode node){
        if(node==null){
            return ;
        }
        list1.add(node.val);
        preorder(list1,node.left);
        preorder(list1,node.right);
    }
}