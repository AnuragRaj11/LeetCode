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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair<TreeNode,Long>> q=new LinkedList<>();
        q.offer(new Pair<>(root,0L));
        int max=0;
        while(!q.isEmpty()){
            int s=q.size();
            long min=q.peek().getValue(),st=0,ed=0;
            for(int i=0;i<s;i++){
                Pair<TreeNode,Long> p=q.poll();
                TreeNode node=p.getKey();
                long idx=p.getValue()-min;
                if(i==0) st=idx;
                if(i==s-1) ed=idx;
                if(node.left!=null) q.offer(new Pair<>(node.left,2*idx));
                if(node.right!=null) q.offer(new Pair<>(node.right,2*idx+1));
            }
            max=Math.max(max,(int)(ed-st+1));
        }
        return max; 
    }
}