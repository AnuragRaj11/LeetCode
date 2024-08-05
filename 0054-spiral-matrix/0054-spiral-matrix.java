class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

 if (matrix.length == 0) {
      return res;
    }
        int row=0,col=0;
        int rowe=matrix.length-1;
        int cole=matrix[0].length-1;

        while(row<=rowe && col<=cole){ 
            for(int j=col;j<=cole;j++){
            res.add(matrix[row][j]);}
            row++;

            for(int i=row;i<=rowe;i++){
            res.add(matrix[i][cole]);}
            cole--;

            if(row<=rowe){
            for(int j=cole;j>=col;j--){
            res.add(matrix[rowe][j]);} }
            rowe--;

            if(col<=cole){
            for(int i=rowe;i>=row;i--){
            res.add(matrix[i][col]);}}
            col++;
        }
        return res;
    }
}