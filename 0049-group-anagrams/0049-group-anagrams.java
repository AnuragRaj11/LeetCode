class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String w:strs){
            char[] c=w.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            mp.computeIfAbsent(key,k-> new ArrayList<>()).add(w);
        }
       List<List<String>> ans=new ArrayList<>(mp.values());
        return ans;
    }
}