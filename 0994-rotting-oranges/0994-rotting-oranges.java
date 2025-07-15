class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int frsh=0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(grid[i][j]==2) q.offer(new int[]{i,j});
                else if(grid[i][j]==1) frsh++;
        if(frsh==0) return 0;
            int t=0;
            int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            int s =q.size();
            boolean rot=false;
            for(int k=0;k<s;k++){
                int[] curr=q.poll();
                for(int[] d:dir){
                    int ni=curr[0]+d[0],nj=curr[1]+d[1];
                    if(ni>=0 && nj>=0 && ni<r && nj<c && grid[ni][nj]==1){
                        grid[ni][nj]=2;
                        q.offer(new int[]{ni,nj});
                        frsh--;
                        rot=true;
                    }
                }
            }
            if(rot) t++;
        }
        return frsh==0?t:-1;
    }
}