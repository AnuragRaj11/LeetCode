class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
        dfs(board,i,0);
        dfs(board,i,n-1);}
        for(int j=0;j<n;j++){
            dfs(board,0,j);
            dfs(board,m-1,j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=board[i][j]=='T'?'O':'X';
            }
        }
    }
    void dfs(char[][]board,int i,int j){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O') return;
        board[i][j]='T';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }
}