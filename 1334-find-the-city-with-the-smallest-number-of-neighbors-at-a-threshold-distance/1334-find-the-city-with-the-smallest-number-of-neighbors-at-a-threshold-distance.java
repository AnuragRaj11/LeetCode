class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] g=new int[n][n];
        for(int[] r:g) Arrays.fill(r,1_000_000);
        for(int i=0;i<n;i++) g[i][i]=0;
        for(int[] a:edges) g[a[0]][a[1]]=g[a[1]][a[0]]=a[2];
        for(int k=0;k<n;k++)
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        g[i][j]=Math.min(g[i][j],g[i][k]+g[k][j]);
        int ans=-1,mi=n;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++) if(g[i][j]<=distanceThreshold) c++;
            if(c<=mi){mi=c;ans=i;}
        }
        return ans;
    }
}