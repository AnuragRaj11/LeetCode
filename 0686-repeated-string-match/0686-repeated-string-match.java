class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(a.isEmpty()){
            return b.isEmpty() ?0:-1;
        }
        int min =(b.length()+a.length()-1)/a.length();
        StringBuilder r=new StringBuilder();
        for(int i=0;i<min+2;i++){
            r.append(a);
            if(r.indexOf(b)!=-1){
            return i+1;
            }
        }
        return -1;
    }
}