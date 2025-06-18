class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
     int[][] dp=new int[s.length()][s.length()];
     for(int i[]:dp){
        Arrays.fill(i,-1);}
        return solve(0,0,s,new HashSet<>(wordDict),dp);
    }
    private boolean solve(int st,int e,String s,Set<String> wd,int[][]dp){
        if(dp[st][e]!=-1) return dp[st][e]==1 ? true:false;
        if(e==s.length()-1){
            if(wd.contains(s.substring(st,e+1))) return true;
            return false;
        }
        if(wd.contains(s.substring(st,e+1))){
            if(solve(e+1,e+1,s,wd,dp)){
                dp[st][e]=1;
                return true;
            }
        }
        boolean ans=solve(st,e+1,s,wd,dp);
        dp[st][e]=ans?1:0;
        return ans;
    }
}