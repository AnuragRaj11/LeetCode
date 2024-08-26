class Solution {
    public int countHomogenous(String s) {
        int ans=0,c=0;
        int mod=1000000007;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            ans=(ans+c)%mod;
        }
        return ans;
    }
}  