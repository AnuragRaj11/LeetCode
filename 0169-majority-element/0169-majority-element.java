class Solution {
    public int majorityElement(int[] nums) {
       int cnt=0,cnd=0;
       for(int i=0;i<nums.length;i++){
        if(cnt==0){
            cnd=nums[i];
        }
        if(cnd==nums[i]){
            cnt++;
        }
        else{
            cnt--;
        }
       }
       return cnd;
    }
}