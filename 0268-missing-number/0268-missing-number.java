class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int as=(nums.length*(nums.length+1)/2);
        int mn=as-sum;
        return mn;
    }
}