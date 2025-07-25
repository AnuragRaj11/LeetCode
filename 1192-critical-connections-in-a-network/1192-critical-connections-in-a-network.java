class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    int tim=0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] g=new ArrayList[n];
        for(int i=0;i<n;i++) g[i]=new ArrayList<>();
        for(var c:connections){
            g[c.get(0)].add(c.get(1));
            g[c.get(1)].add(c.get(0));
        }
        dfs(0,-1,new int[n],new int[n],new boolean[n],g);
        return ans;
    }
    void dfs(int u,int p,int[] ti,int[] low,boolean[] vis,List<Integer>[] g){
        vis[u]=true;
        ti[u]=low[u]=tim++;
        for(int v:g[u]){
            if(v==p) continue;
            if(!vis[v]){
                dfs(v,u,ti,low,vis,g);
                low[u]=Math.min(low[u],low[v]);
                if(low[v]>ti[u]) ans.add(List.of(u,v));
            } else low[u]=Math.min(low[u],ti[v]);
        }
    }
}