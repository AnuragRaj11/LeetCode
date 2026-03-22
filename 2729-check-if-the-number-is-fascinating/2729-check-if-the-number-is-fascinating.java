class Solution {
    public boolean isFascinating(int n) {
     int n1=2*n;
     int n2=3*n;
     String r=""+n+n1+n2;
     if(r.length()!=9) return false;
     if(r.contains("1") && r.contains("2") && r.contains("3") && 
     r.contains("4") && r.contains("5") && r.contains("6") && 
     r.contains("7") && r.contains("8") && r.contains("9")){
     return true;
     }
     return false;
    }
}