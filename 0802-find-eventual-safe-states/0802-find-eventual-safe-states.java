class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int[] clr=new int[n];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++) 
        if(dfs(i,graph,clr)) ans.add(i);
        return ans;
    }
    boolean dfs(int node,int[][] graph,int[] clr){
        if(clr[node]!=0) return clr[node]==2;
        clr[node]=1;
        for(int nxt:graph[node])
        if(!dfs(node,graph,clr)) return false;
        clr[node]=2;
        return true;
    }
}