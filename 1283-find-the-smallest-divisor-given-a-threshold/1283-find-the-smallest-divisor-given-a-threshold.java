class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,r=0;
        for(int i:nums){
            r=Math.max(i,r);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            int sum=0;
            for(int i:nums){
                sum+=(i+mid-1)/mid;
            }
            if(sum>threshold){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}