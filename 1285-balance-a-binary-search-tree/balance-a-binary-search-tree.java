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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrder(root, values);
        return buildBalancedBST(values, 0, values.size() - 1);
    }
    
    private void inOrder(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }
        inOrder(root.left, values);   
        values.add(root.val);         
        inOrder(root.right, values);  
    }
    
    private TreeNode buildBalancedBST(List<Integer> values, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(values.get(mid));
        root.left = buildBalancedBST(values, start, mid - 1);   
        root.right = buildBalancedBST(values, mid + 1, end);    
        return root;
    }
}