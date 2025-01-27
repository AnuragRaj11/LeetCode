class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       return p(nums);
       
    }
    static List<List<Integer>> p (int[] nums){
        List <List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        int tp=1<<n;
        
        for(int i =0; i<tp;i++){
             List<Integer> sb = new ArrayList<>();
             for(int j=0;j<n;j++){
                 if((i&(1<<j))!=0){
                     sb.add(nums[j]);
                 }
             }
             ans.add(sb);
        }
        return ans;
    } 
}