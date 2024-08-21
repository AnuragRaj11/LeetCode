class Solution {

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int s=0,m=0,e=nums.length-1;
        while(m<=e){
            if(nums[m]==0){
                swap(nums,m,s);
                m++; s++;
            }
            else if(nums[m]==2){
                swap(nums,m,e);
                e--;
            }
            else{
                m++;
            }
        }

    }
}