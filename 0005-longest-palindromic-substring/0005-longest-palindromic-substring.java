class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String max=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String odd=center(s,i,i);
            String even=center(s,i,i+1);
            if(odd.length()>max.length()){
                max=odd;
            }
            if(even.length()>max.length()){
                max=even;
            }
        }
        return max;
    }
    private String center(String s,int l,int r){
        while(l>=0 &&r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}