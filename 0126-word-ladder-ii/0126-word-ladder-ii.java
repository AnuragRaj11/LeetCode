class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList), curr=new HashSet<>();
        Map<String,List<String>> gr =new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        if(!dict.contains(endWord)) return ans;
        curr.add(beginWord);
        boolean fd=false;
        while(!dict.isEmpty()){
            Set<String> nxt=new HashSet<>();
            dict.removeAll(curr);
            for(String wrd:curr){
                char[] ch=wrd.toCharArray();
                for(int i=0;i<ch.length;i++){
                    char old=ch[i];
                    for(char c='a';c<='z';c++){
                        ch[i]=c;
                        String nei=new String(ch);
                        if(dict.contains(nei)){
                            gr.computeIfAbsent(nei,k-> new ArrayList<>()).add(wrd);
                            nxt.add(nei);
                            if(nei.equals(endWord)) fd=true;
                        }
                    }
                    ch[i]=old;
                }
            }
            curr=nxt;
        }
        if(!fd) return ans;
        LinkedList<String> path=new LinkedList<>();
        path.add(endWord);
        dfs(endWord,beginWord,gr,path,ans);
        return ans;
    }
    void dfs(String wrd,String beginWord,Map<String,List<String>> gr,LinkedList<String> path,List<List<String>> ans){
        if(wrd.equals(beginWord)){
            ans.add(new ArrayList<>(path));
            Collections.reverse(ans.get(ans.size()-1));
            return;
        }
        for(String prev:gr.getOrDefault(wrd,new ArrayList<>())){
            path.addLast(prev);
            dfs(prev,beginWord,gr,path,ans);
            path.removeLast();
        }
    } 
}