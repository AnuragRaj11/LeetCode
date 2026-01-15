class Solution {
    public String addBinary(String a, String b) {
        int a1=Integer.parseInt(a,2);
        int b1=Integer.parseInt(b,2);
        int sum=a1+b1;
        String ans=Integer.toBinaryString(sum);
        return ans;
    }
}