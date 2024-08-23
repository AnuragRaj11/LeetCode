class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st1=strs[0];
        String st2=strs[strs.length-1];
        int i=0;
        while(i<st1.length() && st1.charAt(i)==st2.charAt(i)){
            i++;
        }
        return i==0?"":st1.substring(0,i);
    }
}