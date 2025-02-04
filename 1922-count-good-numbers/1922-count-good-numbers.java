class Solution {
    private  long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long e=(n+1)/2;
        long o=n/2;
        long f= pow(5,e)%MOD;
        long s=pow(4,o)%MOD;
        return (int) ((f*s)%MOD);
    }
    private long pow(long x,long n){
        if (n==0) return 1;
        long temp = pow(x,n/2);
        if(n%2==0){
            return (temp*temp)%MOD;
        } 
        else{
            return (x*temp*temp)%MOD;
        }
    }
}