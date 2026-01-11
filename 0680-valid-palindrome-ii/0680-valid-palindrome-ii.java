class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return palind(s,l+1,r) || palind(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
            private boolean palind(String s,int l,int r){
                   while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        }
}