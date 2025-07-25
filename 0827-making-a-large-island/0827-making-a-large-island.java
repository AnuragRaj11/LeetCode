class Solution {
    private static final int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
    public int largestIsland(int[][] grid) {
        int n=grid.length,id=2,mx=0;
        Map<Integer,Integer> isl=new HashMap<>();
        for(int i=0;i<n;++i)
        for(int j=0;j<n;++j)
        if(grid[i][j]==1)
        isl.put(id,dfs(grid,i,j,id++,n));
        if(isl.size()==0) return 1;
        mx=Collections.max(isl.values());
        for(int i=0;i<n;++i)
        for(int j=0;j<n;++j)
        if(grid[i][j]==0){
        Set<Integer> sen=new HashSet<>();
        int nws=1;
        for(int[] d:dir){
            int x=i+d[0],y=j+d[1];
            if(x>=0 && y>=0 && x<n && y<n && grid[x][y]>1 && sen.add(grid[x][y]))
            nws+=isl.get(grid[x][y]);
        }
        mx=Math.max(mx,nws);
    }
    return mx;
    }
    int dfs(int[][] grid,int i,int j,int id,int n){
        if(i<0 || j<0 || i>=n || j>=n || grid[i][j]!=1) return 0;
        grid[i][j]=id;
        int sz=1;
        for(int[] d:dir)
            sz+=dfs(grid,i+d[0],j+d[1],id,n);
            return sz;
    }
}