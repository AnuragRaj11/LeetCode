class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> ans= new ArrayList<>();
        int k=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                 nums[k]=nums[i];
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}