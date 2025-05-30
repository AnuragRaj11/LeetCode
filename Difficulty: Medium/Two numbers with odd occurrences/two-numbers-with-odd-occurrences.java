//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java

class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        return (odd(Arr));
    }
    static int[] odd(int[] Arr){
        int uq=0;
        for(int n:Arr){
            uq^=n;
        }
        
        int dif=uq&-uq;
        int od1=0,od2=0;
        
        for(int n: Arr){
            if((n&dif)==0){
                od1^=n;
            }
            else{
                od2^=n;
            }
        }
        
        int[] ans = (od1>od2) ? new int[] {od1,od2} : new int[] {od2,od1};
        return ans;
    }
}