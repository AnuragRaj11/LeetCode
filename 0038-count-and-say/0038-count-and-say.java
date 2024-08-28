class Solution {
    public String countAndSay(int n) {
     if(n==1) return "1";
        String s=countAndSay(n-1);
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            int c=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                i++; c++;
            }
            ans.append(c).append(ch);
            i++;
        }
        return ans.toString();
    }
}