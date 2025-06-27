class Solution {
    public int trap(int[] height) {
        int L=0,R=height.length-1;
        int Lmax=height[L],Rmax=height[R];
        int water=0;
        while(L<R){
            if(Lmax<Rmax){
                L++;
                Lmax=Math.ma(Lmax,height[L]);
                water+=Lmax-height[L];
            }
            else{
                R--;
                Rmax=Math.max(Rmax,height[R]);
                water+=Rmax-height[R];
            }
        }
        return water;
    }
}