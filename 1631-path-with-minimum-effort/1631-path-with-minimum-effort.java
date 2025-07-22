class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length,n=heights[0].length;
        int[][] d=new int[m][n];
        for(int[] r:d) Arrays.fill(r,Integer.MAX_VALUE);
        d[0][0]=0;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        q.offer(new int[]{0,0,0});
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[]t=q.poll();
            int e=t[0],x=t[1],y=t[2];
            if(x==m-1 && y==n-1) return e;
            for(int[] di:dir){
                int nx=x+di[0],ny=y+di[1];
                if(nx>=0 && ny>=0 && nx<m && ny<n){
                    int ne=Math.max(e,Math.abs(heights[x][y]-heights[nx][ny]));
                    if(ne<d[nx][ny]){
                        d[nx][ny]=ne;
                        q.offer(new int[]{ne,nx,ny});
                    }
                }
            }
        }
        return -1;
    }
}