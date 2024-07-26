class Solution 
{  
     private boolean help(int i,int n,String s) {
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return help(i+1,n,s);
    }

    public boolean isPalindrome(String s) {
     s=s.toLowerCase();
     s=s.replaceAll("[^a-zA-Z0-9]", "");
     int n=s.length();
     if(n == 0) {return true;} 
     return help(0,n,s);
     }
} 