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

   
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
    //     if(preorder.length == 0){
    //         return null;
    //     }

    //     int r = preorder[0];
    //     int index= 0 ;

    //     for(int i=0;i<inorder.length;i++){
    //         if(inorder[i]==r){
    //             index=i;
    //         }
    //     }

    //     TreeNode node = new TreeNode(r);

    //     node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
    //     node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

    //     return node;
    // }

        HashMap<Integer,Integer> hashmap = new HashMap<>();
         int[] index = {0};
        for(int i=0;i<inorder.length;i++){
            hashmap.put(inorder[i],i);
        }

          return helper(preorder,inorder,0,preorder.length-1,hashmap,index);
    }


    public TreeNode helper(int[] preorder,int[] inorder,int l,int r,HashMap<Integer,Integer> hashmap,int[] index){
        if(l > r){
            return null;
        }

        int current = preorder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);
        if(l == r){
            return node;
        }
        int inorderIndex = hashmap.get(current);


        node.left = helper(preorder,inorder,l,inorderIndex - 1,hashmap,index);
        node.right = helper(preorder,inorder,inorderIndex + 1,r,hashmap,index);

        return node;
    }
}      