class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int[] vis=new int[n];
        int prov=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,isConnected);
                prov++;
            }
        }
        return prov;
    }
    void dfs(int node,int[] vis,int[][] isConnected){
        vis[node]=1;
        for(int i=0;i<isConnected[node].length;i++){
            if(isConnected[node][i]==1 && vis[i]==0){
                dfs(i,vis,isConnected);
            }
        }
    }
}