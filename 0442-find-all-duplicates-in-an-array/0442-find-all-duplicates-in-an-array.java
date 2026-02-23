class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lt=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]<0){
                lt.add(Math.abs(nums[i]));
            }
            else{
                nums[ind]=-nums[ind];
            }
        }
        return lt;
    }
}