class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[x];
            if(mp.containsKey(comp)){
                return new int[] {mp.get(nums[i],i)};
            }
            return new int[] {mp.put(nums[i],i)}
        }
        return new int[] {-1,-1};
    }
}