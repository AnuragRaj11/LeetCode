class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        StringBuilder sb =new StringBuilder();
        while(n>0){
            if(n%2==0){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
            n=n/2;
        }
        sb.reverse();
        int ans=0;
        for(char c:sb.toString().toCharArray()){
            int x=c-'0';
            ans=ans*2+x;
        }
        return ans;
    }
}