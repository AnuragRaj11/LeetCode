class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')') c--;
            if(c!=0) ans.append(s.charAt(i));
            if(s.charAt(i)=='(') c++;
        }
        return ans.toString();
    }
}