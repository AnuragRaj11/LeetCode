class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int sum=0;
        while(l<r){
            int t=Math.min(height[l],height[r])*(r-l);
            sum=Math.max(sum,t);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return sum;
    }
}