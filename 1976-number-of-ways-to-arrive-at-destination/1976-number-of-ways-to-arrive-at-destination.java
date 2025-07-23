class Solution {
    public int countPaths(int n, int[][] roads) {
        List<int[]>[] g=new ArrayList[n];
        for(int i=0;i<n;i++) g[i]=new ArrayList<>();
        for(int[] r:roads){
            g[r[0]].add(new int[]{r[1],r[2]});
            g[r[1]].add(new int[]{r[0],r[2]});
        }
        long[] d=new long[n];
        Arrays.fill(d,Long.MAX_VALUE); d[0]=0;
        int[] w=new int[n];w[0]=1;
        int m=1_000_000_007;
        var pq=new PriorityQueue<long[]>((a,b)->Long.compare(a[0],b[0]));
        pq.add(new long[]{0,0});
        while(!pq.isEmpty()){
            var a=pq.poll();
            int u=(int)a[1];
            long t=a[0];
            if(t>d[u]) continue;
            for(var x:g[u]){
                int v=x[0],c=x[1];
                if(t+c<d[v]){
                    d[v]=t+c;
                    w[v]=w[u];
                pq.add(new long[]{d[v],v});
                }
                else if(t+c==d[v]) w[v]=(w[v]+w[u])%m;
            }
        }
            return w[n-1];
    }
}