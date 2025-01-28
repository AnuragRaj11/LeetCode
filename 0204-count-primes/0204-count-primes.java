class Solution {
    public int countPrimes(int n) {
        return sieve(n-1);
    }
    static int  sieve(int n){
        if(n<=1) { return 0; }
        Boolean[] p = new Boolean[n+1];
        Arrays.fill(p,true);
        p[0]=false;
        p[1]=false;
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<=n;i++){
            if(p[i]){
                c++;
            }
        }
        return c;
    }
}