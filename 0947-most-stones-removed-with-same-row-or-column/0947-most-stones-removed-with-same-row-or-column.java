class Solution {
    Map<Integer,Integer> p=new HashMap<>();
    public int removeStones(int[][] stones) {
        for(var a:stones) union(a[0],~a[1]);
        for(int x:p.keySet()) find(x);
        return stones.length-new HashSet<>(p.values()).size();
    }
    int find(int x){
        p.putIfAbsent(x,x);
        if(p.get(x)!=x) p.put(x,find(p.get(x)));
        return p.get(x);
    }
    void union(int x,int y){
        p.put(find(x),find(y));
    }
}