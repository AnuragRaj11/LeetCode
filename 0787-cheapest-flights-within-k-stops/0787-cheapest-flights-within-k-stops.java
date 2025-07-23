class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer,List<int[]>> gr=new HashMap<>();
        for(int[] fli:flights){
            gr.computeIfAbsent(fli[0],x->new ArrayList<>()).add(new int[]{fli[1],fli[2]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.offer(new int[]{0,src,k+1});
        int[] vis=new int[n];
        Arrays.fill(vis,-1);
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int cst=cur[0],cty=cur[1],stp=cur[2];
            if(cty==dst) return cst;
            if(vis[cty]>=stp) continue;
            vis[cty]=stp;
            if(stp>0){
                for(int[] nei:gr.getOrDefault(cty,new ArrayList<>())){
                    pq.offer(new int[]{cst+nei[1],nei[0],stp-1});
                }
            }
        }
        return -1;
    }
}