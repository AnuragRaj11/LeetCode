class Solution {
    public int minAddToMakeValid(String s) {
        int op=0,cl=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
            { op++;}
              else{
                if(op<=0){
                    cl++;
                }
                else{ op--;}
            }
        }
        return (op+cl);
    }
}