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
  /*   public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,List<Integer>> colm=new TreeMap<>();
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        q.offer(new Pair<>(root,0));
        while(!q.isEmpty()){
            Pair<TreeNode,Integer> pair=q.poll();
            TreeNode node=pair.getKey();
            int col=pair.getValue();
            colm.putIfAbsent(col,new ArrayList<>());
            colm.get(col).add(node.val);
            if(node.left!=null){
                q.offer(new Pair<>(node.left,col-1));
            }
            if(node.right!=null){
                q.offer(new Pair<>(node.right,col+1));
            }
        }
        for(List<Integer>colv:colm.values()){
                ans.add(colv);
            }
            return ans;
    } */
    class Tuple{
        TreeNode node;
        int row;
        int col;
        public Tuple(TreeNode node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.row, y = tuple.col;

            map.putIfAbsent(x, new TreeMap<>());
            map.get(x).putIfAbsent(y, new PriorityQueue<>());
            map.get(x).get(y).offer(node.val);

            if (node.left != null)
                q.offer(new Tuple(node.left, x - 1, y + 1));
            if (node.right != null)
                q.offer(new Tuple(node.right, x + 1, y + 1));
        }

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> colMap : map.values()) {
            List<Integer> colList = new ArrayList<>();
            for (PriorityQueue<Integer> pq : colMap.values()) {
                while (!pq.isEmpty()) {
                    colList.add(pq.poll());
                }
            }
            result.add(colList); // Moved here, correctly after processing full column
        }

        return result;
    }
}

