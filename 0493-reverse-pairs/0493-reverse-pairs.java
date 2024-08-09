class Solution {
          public static void merge(int[] nums,int low,int mid,int high){
            ArrayList <Integer> temp= new ArrayList <> ();
            int l=low,r=mid+1;
            while(l<=mid && r<=high){
                if(nums[l]<+nums[r]){
                    temp.add(nums[l]); l++;
                }
                else{
                    temp.add(nums[r]); r++;
                }
            }
            while(l<=mid){
                temp.add(nums[l]); l++;
            }
            while(r<=high){
                temp.add(nums[r]); r++;
            }
            for(int i=low;i<=high;i++){
                nums[i]=temp.get(i-low);
            }
        }
        public static int c(int[]nums,int low,int mid,int high){
            int r=mid+1,ct=0;
            for(int i=low;i<=mid;i++){
                while(r<=high && nums[i]>2L*nums[r]) r++;
                ct+=(r-(mid+1));
            }
            return ct;
        } 
        public static int  ms(int[] nums,int low,int high){
            int ct=0;
            if(low>=high) return ct;
            int mid=(low+high)/2; 
            ct+=ms(nums,low,mid);
            ct+=ms(nums,mid+1,high);
            ct+= c(nums,low,mid,high);
            merge(nums,low,mid,high); return ct;
        }
        
    public int reversePairs(int[] nums) {
          return ms(nums,0,nums.length-1);
    }
}