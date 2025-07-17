class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<numCourses;i++) g.add(new ArrayList<>());
        for(int[] p:prerequisites) g.get(p[1]).add(p[0]);
        int[] vis=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        if(dfs(i,g,vis)) return false;
        return true;
    }
    boolean dfs(int u,List<List<Integer>> g,int[] vis){
        if(vis[u]==1) return true;
        if(vis[u]==2) return false;
        vis[u]=1;
        for(int v:g.get(u))
        if(dfs(v,g,vis)) return true;
        vis[u]=2;
        return false;
    }
}