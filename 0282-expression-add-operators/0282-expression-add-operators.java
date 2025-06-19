class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans=new ArrrayList<>();
        solve(0,num,target,"",ans,0,0);
        return ans;
    }
    private void solve(int ind,String num,int target,String curr,List<String> ans,long prev,long res){
        if(ind==num.length()){
            if(res==target){
                ans.add(curr);
            }
            return;
        }
        String st="";
        long currRes=0;
        for(int i=ind;i<num.length();i++){
            if(i>ind && num.charAt(ind)=='0') break;
            st+=num.charAt(i);
            currRes=currRes*10+(num.charAt(i)-'0');
            if(ind==0){
                solve(i+1,num,target,st,ans,currRes,currRes);
            }
            else{
                solve(i+1,num,target,curr+"+"+st,ans,currRes,res+currRes);
                solve(i+1,num,target,curr+"-"+st,ans,currRes,res-currRes);
                solve(i+1,num,target,curr+"*"+st,ans,prev*currRes,res-prev+(prev*currRes));
            }
        }
    }
}