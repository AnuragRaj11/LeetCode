class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> gr=new HashMap<>();
        for(int[] t:times)
            gr.computeIfAbsent(t[0],x->new ArrayList<>()).add(new int[]{t[1],t[2]});
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.offer(new int[]{k,0});
        Map<Integer,Integer> dist=new HashMap<>();
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int nod=cur[0],tim=cur[1];
            if(dist.containsKey(nod)) continue;
            dist.put(nod,tim);
                for(int[] nei:gr.getOrDefault(nod,new ArrayList<>()))
                    pq.offer(new int[]{nei[0],tim+nei[1]});
        }
        if(dist.size()<n) return -1;
        return Collections.max(dist.values());
    }
}