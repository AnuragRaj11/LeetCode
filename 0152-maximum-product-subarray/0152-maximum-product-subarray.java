class Solution {
    public int maxProduct(int[] nums) {
        double ans=nums[0],r=1,l=1;
     
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(l==0) l=1;
            if(r==0) r=1;
            l*=nums[i];
            r*=nums[n-1-i];
            ans=Math.max(ans,Math.max(l,r));
        }
        return (int)ans;
    }
}