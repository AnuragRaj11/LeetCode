//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
        return ds(str1) >= ds(str2) ? str1 : str2;
    }
    private static int ds(String S){
        int[] last = new int[26];
        Arrays.fill(last,-1);
        int total=1;
        for(char c : S.toCharArray()){
            int idx=c - 'a';
            int curr=total;
            total+=(last[idx]== -1)? curr : curr-last[idx];
            last[idx]=curr;
        }
        return total;
    }
}