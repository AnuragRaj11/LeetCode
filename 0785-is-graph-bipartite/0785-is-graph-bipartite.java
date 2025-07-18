class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] col=new int[n];
        Arrays.fill(col,-1);
        for(int i=0;i<n;i++){
            if(col[i]==-1 && !dfs(graph,col,i,0)) return false;
        }
        return true;
    }
    boolean dfs(int[][] graph,int[] col,int node,int c){
        col[node]=c;
        for(int nei:graph[node]){
            if(col[nei]==-1){
                if(!dfs(graph,col,nei,1-c)) return false;
            }
            else if(col[nei]==c) return false;
        }
        return true;
    }
}