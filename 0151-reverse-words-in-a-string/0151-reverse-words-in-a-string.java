class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split("\\s+");
        String n="";
        for(int i=words.length-1;i>0;i--){
            n+=words[i]+" ";
        }
        return n+words[0];
    }
}