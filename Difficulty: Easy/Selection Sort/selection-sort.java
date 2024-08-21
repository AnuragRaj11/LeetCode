//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[],int s,int e)
	{
        // code here such that selectionSort() sorts arr[]
        int max=s;
        for(int i=s;i<=e;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
	}
	static void swap(int[]arr,int f,int sec)
	{
	    int temp=arr[f];
	    arr[f]=arr[sec];
	    arr[sec]=temp;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<arr.length;i++){
	        int last=arr.length-1-i;
	        int maxi=select(arr,0,last);
	        swap(arr,maxi,last);
	    }
	}
}