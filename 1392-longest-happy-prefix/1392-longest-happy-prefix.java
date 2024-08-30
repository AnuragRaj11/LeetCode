class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int lps [] =new int[n]; 
        int pref=0;
        for(int suf=1;suf<n;suf++){
            while(pref>0 && s.charAt(suf)!=s.charAt(pref)){
                pref=lps[pref-1];
            }
            if(s.charAt(suf)==s.charAt(pref)){
                pref++;
                lps[suf]=pref;
            }
        }
        return s.substring(0,lps[n-1]); 
    }
}