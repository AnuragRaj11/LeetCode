class Solution {
    public boolean isPalindrome(int x) {
         if(x<0){
                return false;
            }

        int rev=0;
        int p=x;

        while(p!=0){
            int n = p % 10;
            p/=10;
            rev=(rev*10)+n;
            }
        return (rev==x);
    }
}