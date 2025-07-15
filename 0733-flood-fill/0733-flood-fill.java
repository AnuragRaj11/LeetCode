class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldc=image[sr][sc];
        if(oldc==color) return image;
        fill(image,sr,sc,oldc,color);
        return image;
    }
    void fill(int[][] image,int r,int c,int oldc,int color){
        if(r<0||c<0||r>=image.length||c>=image[0].length) return;
        if(image[r][c]!=olc) return;
        image[r][c]=color;
        fill(image,r+1,c,oldc,color);
        fill(image,r-1,c,oldc,color);
        fill(image,r,c+1,oldc,color);
        fill(image,r,c-1,oldc,color);
    }
}