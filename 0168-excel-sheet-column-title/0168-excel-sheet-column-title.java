class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder();
        while(columnNumber!=0){
            columnNumber--;
            char curr=(char) ('A'+columnNumber%26);
            ans.append(curr);
            columnNumber/=26;
        }
        return ans.reverse().toString();
    }
}