class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int i=-0,j=mat[0].length-1;
        while(i<mat.length && j>+0){
            if(i+1<mat.length && mat[i+1][j]>mat[i][j]){
                i++;
            }
            else if(j-1>=0 && mat[i][j-1]>mat[i][j]){
                j--;
            } 
            else{
                break; 
            }
        }
        return new int[] {i,j};
    }
}