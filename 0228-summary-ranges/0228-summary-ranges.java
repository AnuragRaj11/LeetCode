class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int st=nums[i];
            while(i+1<n && nums[i]+1==nums[i+1]){
                i++;
            }
            int ed=nums[i];
            if(st==ed){
                ans.add(String.valueOf(st));
            }
            else{
                ans.add(st+ "->"+ed);
            }
        }
        return ans;
    }
}