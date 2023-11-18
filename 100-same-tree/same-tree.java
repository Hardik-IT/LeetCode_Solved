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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){
            TreeNode pt = queue.poll();
            TreeNode qt = queue.poll();

            if(pt == null && qt == null){
                continue;
            }else if(pt == null || qt == null || pt.val!=qt.val){
                return false;
            }

            queue.add(pt.left);
            queue.add(qt.left);
            queue.add(pt.right);
            queue.add(qt.right);
        }
        return true;
    }
}