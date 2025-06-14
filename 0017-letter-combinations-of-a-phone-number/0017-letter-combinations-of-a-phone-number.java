class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> map = getMap();
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans ;
        solve(0,digitd,"",ans,map);
        return ans;
    }
    private void solve(int i,String digits,String s,List<String>ans,Map<Character,String> map){
        if(i==digits.length()){
            ans.add(s); 
            return;
        }
        for(char c:map.get(digits.CharAt(i).toCharAt())){
            String temp = new String(s);
            temp += c;
            solve(i+1,digits,temp,ans,map);
        }
    }
    private Map<Character,String> getMap(){
                Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");
        return map;
    }
}