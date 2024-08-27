class Solution {
    public int beautySum(String s) {
        int ans=0;
        int n=s.length();
        char[] a=s.toCharArray();
        for(int i=0;i<n;i++){
            int[] fq=new int[26];
            for(int j=i;j<n;j++){
                fq[a[j]-'a']++;
                int min =Integer.MAX_VALUE;
                int max =Integer.MIN_VALUE;
                for(int k=0;k<26;k++){
                    if(fq[k]>0){
                        min=Math.min(min,fq[k]);
                        max=Math.max(max,fq[k]);
                    }
                }
                ans+=max-min;
            }
        }   
                return ans;
     }
}