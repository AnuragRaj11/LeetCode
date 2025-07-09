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
    int prei=0;
    Map<Integer,Integer> m=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            m.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder,int st,int ed){
        if(st>ed) return null;
        int rootval=preorder[prei++];
        TreeNode root=new TreeNode(rootval);
        int rootidx=m.get(rootval);
        root.left=build(preorder,st,rootidx-1);
        root.right=build(preorder,rootval+1,ed);
        return root;
    } 
}