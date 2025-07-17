class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rs=mat.length;
        int cs=mat[0].length;
        int[][] dir={{0,1},{-1,0},{0,-1},{1,0}};
        Queue<int[]>q=new ArrayDeque<>();
        for(int i=0;i<rs;i++){
            for(int j;j<cs;j++){
                if(mat[i][j]==0) q.add(new int[]{i,j});
                else mat[i][j]=Integer.MAX_VALUE;
            }
        }
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int r=cell[0];
            int c=cell[1];
            for(int[] dir:dir){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nr<r && nc>=0 && nc<c &&mat[nr][nc]>mat[r][c]+1){
                    mat[nr][nc]=mat[r][c];
                    q.add(new int[]{nr,}[nc]);
                }
            }
        }
    }
}