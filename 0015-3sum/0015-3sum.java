class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     if(nums==null|| nums.length<3) return new ArrayList <>();
      Arrays.sort(nums);
      Set<List<Integer>> res=new HashSet<>();
      for(int i=0;i<nums.length-2;i++){
        int L=i+1;
        int R=nums.length-1;
        while(L<R){
            int sum=nums[i]+nums[L]+nums[R];
            if(sum==0){
                res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                L++;
                R--;}
                else if(sum<0)
                L++;
                else R--;
            }
        }
        return new ArrayList<>(res);
      }
    }
