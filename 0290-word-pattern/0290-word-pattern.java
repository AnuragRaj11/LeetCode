class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] wrds=s.split(" ");
        if(pattern.length()!=wrds.length) return false;
        Map<Object,Integer> mp=new HashMap<>();
        for(int i=0;i<wrds.length;i++){
            if(!Objects.equals(mp.put(pattern.charAt(i),i),mp.put(wrds[i],i))){
            return false;
            }
        }
        return true;
    }
}