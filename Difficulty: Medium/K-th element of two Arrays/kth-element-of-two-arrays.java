//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

// } Driver Code Ends
// User function Template for Java
class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int n1=arr1.length,n2=arr2.length;
        if(n1>n2){ return kthElement(k,arr2,arr1); }
        int n=n1+n2;
        int l=Math.max(0,k-n2),h=Math.min(k,n1);
        while(l<=h){
            int m1=(l+h)/2;
            int m2=k-m1;
            int l1=(m1>0)?arr1[m1-1]:Integer.MIN_VALUE;
            int l2=(m2>0)?arr2[m2-1]:Integer.MIN_VALUE;
            int r1=(m1<n1)?arr1[m1]:Integer.MAX_VALUE;
            int r2=(m2<n2)?arr2[m2]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                h=m1-1;
            }
            else l=m1+1;
        }
        return 0;
    }
}