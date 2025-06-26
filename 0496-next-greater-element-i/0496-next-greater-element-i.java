class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int n:nums2){
            while(!st.isEmpty() && n>st.peek()){
                map.put(st.pop(),n);
            }
            st.push(n);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.getOrDafault(nums1[i],-1);
        }
        return ans;
    }
}