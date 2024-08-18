class Solution {
    public static int cs(int[] nums,int max){
        int c=1;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]>max){
                 c++;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        return c;
    }
    public int splitArray(int[] nums, int k) {
        int l=nums[0],h=0;
        for(int i=0;i<nums.length;i++){
            l=Math.max(l,nums[i]);
            h+=nums[i];
        }
        while(l<=h){
            int mid =l+(h-l)/2;
            int suba=cs(nums,mid);
            if(suba>k){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
}