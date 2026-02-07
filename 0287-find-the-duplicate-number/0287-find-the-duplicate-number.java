class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int s=1;
        int x=0;
        for(int i=0;i<n;i++){
            if(nums[s]==nums[i]){
                x=nums[s];
            }
            s++;
        }
        return x;
    }
}