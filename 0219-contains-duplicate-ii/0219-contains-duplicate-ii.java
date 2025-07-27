class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> st=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(st.containsKey(val) && i-st.get(val)<=k){
                 return true;
            }
           st.put(val,i);
        }
        return false;
    }
}