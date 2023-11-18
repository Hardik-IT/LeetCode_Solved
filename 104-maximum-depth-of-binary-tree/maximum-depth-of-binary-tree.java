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
    public int maxDepth(TreeNode root) {
          Queue<TreeNode> queue = new LinkedList<>();
          if(root == null)
            return 0;
          else
            queue.add(root);
          int numOfLevel = 0;
          while(true){
              int nodeCountAtLevel = queue.size();
              if(nodeCountAtLevel==0){
                  return numOfLevel;
              }
              while(nodeCountAtLevel > 0){
                  TreeNode tn = queue.poll();
                  if(tn.left != null)
                    queue.add(tn.left);
                  if(tn.right != null)
                    queue.add(tn.right);  
                    nodeCountAtLevel--;
              }
              numOfLevel++;
          }
    }
}