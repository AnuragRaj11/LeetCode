class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length,j,k;
        long ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && nums[st.peek()]>(i==n ? Integer.MIN_VALUE : nums[i])){
                j=st.pop();
                k=st.isEmpty() ? -1:st.peek();
                ans-=(long)nums[j]*(i-j)*(j-k);
            }
            st.push(i);
        }
        st.clear();
        for(int i=0;i<=n;i++){
             while(!st.isEmpty() && nums[st.peek()]<(i==n ? Integer.MAX_VALUE : nums[i])){
                j=st.pop();
                k=st.isEmpty() ? -1:st.peek();
                ans+=(long)nums[j]*(i-j)*(j-k);
            }
            st.push(i);
        }
        return ans;
    }
}