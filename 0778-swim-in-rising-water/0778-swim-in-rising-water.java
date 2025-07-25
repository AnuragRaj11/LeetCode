class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        boolean[][] vis=new boolean[n][n];
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{grid[0][0],0,0});
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        while(!pq.isEmpty()){
            var a=pq.poll();
            int t=a[0],x=a[1],y=a[2];
            if(vis[x][y]) continue;
            vis[x][y]=true;
            if( x==n-1 && y==n-1) return t;
            for(var d:dir){
                int i=x+d[0],j=y+d[1];
                if(i>=0 && j>=0 && i<n && j<n && !vis[i][j])
                pq.add(new int[]{Math.max(t,grid[i][j]),i,j});
            }  
        }
        return -1;
    }
}