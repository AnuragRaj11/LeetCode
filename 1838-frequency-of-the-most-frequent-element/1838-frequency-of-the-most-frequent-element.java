class Solution {
    public int maxFrequency(int[] nums, int k) {

    int left=0,right=0; 
    long ans=0;
    Arrays.sort(nums);
      long sum=0;
    while(right<nums.length){
        sum+=nums[right];
    while((right-left+1L)*nums[right]>k+sum){
          sum-=nums[left];
          left++; }
     ans=Math.max(ans,right-left+1L);
     right++;}
    return (int) ans; 
    }
}