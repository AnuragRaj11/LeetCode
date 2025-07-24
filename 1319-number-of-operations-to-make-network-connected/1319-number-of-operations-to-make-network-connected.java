class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        int[] p=new int[n];
        for(int i=0;i<n;i++) p[i]=i;
        int comp=n;
        for(int[] c:connections){
            int a=find(p,c[0]),b=find(p,c[1]);
            if(a!=b){p[a]=b;comp--;}
        }
        return comp-1;
    }
    int find(int p[],int x){
        return p[x]==x?x:(p[x]=find(p,p[x]));
    }
}