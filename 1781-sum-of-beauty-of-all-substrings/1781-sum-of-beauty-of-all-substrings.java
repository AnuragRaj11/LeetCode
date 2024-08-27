class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] fq=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                fq[ch-'a']++;
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