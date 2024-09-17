class Solution {
    public int repeatedStringMatch(String a, String b) {
        int min =b.length()/a.length();
        StringBuilder r=new StringBuilder(a);
        for(int i=0;i<min+2;i++){
            if(r.toString().contains(b)) return i+1;
            else r.append(a);
        }
        return -1;
    }
}