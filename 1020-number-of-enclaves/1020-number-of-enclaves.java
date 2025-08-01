class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            dfs(grid,i,0);
            dfs(grid,i,n-1);
            for(int j=0;j<n;j++){
                dfs(grid,0,j);
                dfs(grid,m-1,j);
            }
        }
        int c=0;
        for(int[] r:grid){
            for(int cell:r){
                if(cell==1) c++;
            }
        }
        return c;
    }
    void dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return;
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}