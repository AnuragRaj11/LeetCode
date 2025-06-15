class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        solve(0,0,s,new ArrayList<>(),ans);
        return ans;
    }
    private void solve(int start,int end,String s,List<String> curr,List<List<String>> ans){
        if(end==s.length()-1){
            if(isPal(start,end,s)){
                curr.add(s.substring(start,end+1));
                ans.add(curr);
            }
            return;
        }
        if(isPal(start,end,s)){
            List<String> list=new ArrayList<>(curr);
            list.add(s.substring(start,end+1));
            solve(end+1,end+1,s,list,ans);
        }
         solve(start,end+1,s,curr,ans);
    }
    private boolean isPal(int start,int end,String s){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}