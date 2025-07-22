class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
      int n=grid.length;
      if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
      Queue<int[]> q=new LinkedList<>();
      q.add(new int[]{0,0,1});
      int[] dir={-1,0,1};
      while(!q.isEmpty()){
        int[]a=q.poll();
        int x=a[0],y=a[1],d=a[2];
        if(x==n-1 && y==n-1) return d;
        for(int i:dir)
        for(int j:dir){
            int k=x+i;
            int m=y+j;
            if(k>=0 && m>=0 && k<n && m<n && grid[k][m]==0){
                q.add(new int[]{k,m,d+1});
                grid[k][m]=1;
            }
        }
      }
      return -1;
    }
}