//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
         return factors1(N);
         
    }
     static int[] factors1(int n) {
         ArrayList<Integer> factor = new ArrayList<>();
      while((n&1)==0){
          if(factor.isEmpty() || factor.get(factor.size()-1)!=2)
          {factor.add(2);}
          n>>=1;
      }
      
      for(int i=3;i*i<=n;i+=2){
          while((n%i)==0){
          if(factor.isEmpty() || factor.get(factor.size()-1)!=i)
          {factor.add(i);}
          n/=i;
      }
      }
        
        if(n>2){
            factor.add(n);
        }
        
        int[] ans=new int[factor.size()];
        for(int i = 0;i<factor.size();i++){
            ans[i]=factor.get(i);
        }
        return ans;
      }
}