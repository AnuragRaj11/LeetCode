class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List <List<Integer>> ans =new ArrayList<>();
        int n =nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<n;j++){
                  if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                long target2=(long) target-(long) nums[i]-nums[j];
                int l=j+1;
                int r=n-1;
                while(l<r){
                    int sum=nums[l]+nums[r];
                    if(sum<target2){
                        l++;}
                    else if(sum>target2){
                        r--; 
                    }
                    else
                   {
                     List<Integer> list=Arrays.asList(nums[i],nums[j],nums[l],nums[r]);
                       ans.add(list);
                      while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        
                        l++;
                        r--;
                    } 
                    
                 }
               
            }
        }
        return ans;
    }
}
 