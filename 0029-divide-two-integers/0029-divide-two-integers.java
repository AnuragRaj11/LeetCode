class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
      int ans=0;
        int sign=((dividend<0)^(divisor<0)) ? -1 : 1;
        long Longdividend=Math.abs((long)dividend);
        long Longdivisor=Math.abs((long)divisor);
        while(Longdividend>=Longdivisor){
            long tempdiv=Longdivisor;
            long mul=1;
            while(Longdividend>=(tempdiv<<1)){
                tempdiv<<=1;
                mul<<=1;
            }
            Longdividend-=tempdiv;
            ans+=mul;
        }
        return sign*ans;  
    }
}