class Solution {
    public List<List<String>> solveNQueens(int n) {
     List<List<String>> ans= new ArrayList<>();
     char[][] board=new char[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='.';
        }
     }
     List<int[]> queens=new ArrayList<>();
     dfs(board,0,queens,ans);
     return ans;
    }
    private void dfs(char[][] board,int r,List<int[]> queens,List<List<String>> ans){
        if(queens.size()==board.length){
            List<String> rows=new ArrayList<>();
            for(char[] row:board){
                rows.add(new String(row));
            }
            ans.add(rows);
            return;
        }
        for(int c=0;c<board.length;c++){
            if(addQ(r,c,queens)){
                board[r][c]='Q';
                queens.add(new int[]{r,c});
                dfs(board,r+1,queens,ans);
                board[r][c]='.';
                queens.remove(queens.size()-1);
            }
        }
    }
    private boolean addQ(int r,int c,List<int[]> queens){
        for(int[] q:queens){
            int dx=Math.abs(r-q[0]);
            int dy=Math.abs(c-q[1]);
            if(dx==0  || dy==0 || dx==dy) return false;
        }
        return true;
    }
}