class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
    }
    
    private void solve(String curr, int open, int close, int max, List<String> ans){
        if(curr.length()==2*max){
            ans.add(curr);
            return;
        }
        if(open < max){
            solve(curr + "(",open +1,close,max,ans);
        }
        
        if(close < open){
            solve(curr + ")",open,close +1,max,ans);
        }
    }
}