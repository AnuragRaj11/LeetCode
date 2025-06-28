class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(char d:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>d){
                st.pop();
                k--;
            }
            st.push(d);
        }
        while(k-->0){
            st.pop();
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st){
            ans.append(c);
        }
        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        return ans.length()==0 ? "0":ans.toString();
    }
}