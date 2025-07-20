class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> ws=new HashSet<>();
        if(!ws.contains(endWord)) return 0;
        Queue<String> wq=new LinkedList<>();
        wq.add(beginWord);
        int dist=1;
        while(!wq.isEmpty()){
            int s=wq.size();
            for(int i=0;i<s;i++){
                String curw=wq.poll();
                if(curw.equals(endWord)){
                    return dist;
                }
                for(int j=0;j<curw.length();j++){
                    char[] temp=curw.toCharArray();
                    for(char c='a';c<='z';c++){
                        temp[j]=c;
                        String nw=new String(temp);
                        if(ws.contains(nw)){
                            wq.add(nw);
                            ws.remove(nw);
                        }
                    }
                }
            }
            dist++;
        }
        return 0;
    }
}