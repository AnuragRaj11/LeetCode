class Solution {
    public void sortColors(int[] nums) {
        //numsays.sort(nums);
        int c=0,c1=0,c2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                c+=1;
            else if(nums[i]==1)
                c1+=1;
            else
                c2+=1;
        }
        int id=0;
        for(int i=0;i<c;i++)
            nums[id++]=0;
        for(int i=0;i<c1;i++)
            nums[id++]=1;
        for(int i=0;i<c2;i++)
            nums[id++]=2;
    
    }
}