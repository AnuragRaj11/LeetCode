/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "null";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder ans=new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null){
                ans.append("null,");
            }else{
            ans.append(node.val).append(",");
            q.add(node.left);
            q.add(node.right);
            }
        }
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.equals("null")) return null;
        Queue<TreeNode> q=new LinkedList<>();
        String[] vals=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(vals[0]));
        q.offer(root);
        int i=1;
        while (!q.isEmpty() && i < vals.length){
               TreeNode curr=q.poll();
            if(!vals[i].equals("null")){
                curr.left=new TreeNode(Integer.parseInt(vals[i]));
                q.offer(curr.left);
            }
            i++;
            if(!vals[i].equals("null")){
                curr.right=new TreeNode(Integer.parseInt(vals[i]));
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));