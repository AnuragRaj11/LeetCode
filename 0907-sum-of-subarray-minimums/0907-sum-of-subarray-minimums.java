class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<int[]> st=new Stack<>();
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()[0]>=arr[i]){
                st.pop();
            }
            int j=st.isEmpty() ? -1:st.peek()[1];
            res[i]=st.isEmpty() ? arr[i]*(i+1):res[j]+arr[i]*(i-j);
            st.push(new int[]{arr[i],i});
        }
        long Mod=(long) 1000000007;
        long ans=0;
        for(int i=0;i<arr.length;i++){
            ans=(ans+(long)res[i]) %Mod;
        }
        return (int) ans;
    }
}