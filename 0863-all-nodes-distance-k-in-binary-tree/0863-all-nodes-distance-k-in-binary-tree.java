/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ans=new ArrayList<>();
    HashMap<TreeNode,TreeNode> parm=new HashMap<>();
    Set<TreeNode> visit=new HashSet<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        build(root);
        dfs(target,0,k);
        return ans;
    }
    private void build(TreeNode node){
        if(node==null) return;
        if(node.left!=null){
            parm.put(node.left,node);
            build(node.left);
        }
        if(node.right!=null){
            parm.put(node.right,node);
            build(node.right);
        }
    }
    private void dfs(TreeNode node,int dist,int k){
        if(node==null || visit.contains(node)) return;
        visit.add(node);
        if(dist==k){
            ans.add(node.val);
            return;
        }
        dfs(node.left,dist+1,k);
        dfs(node.right,dist+1,k);
        dfs(parm.get(node),dist+1,k);
    }
}