class Solution {
    public int uniquePaths(int m, int n) {
        long res-1;
        int tot=m+n-2;
        int choose=Math.min(m-1,n-1);
        for(int i=1;i<=choose;i++){
            res=res*(tot-i+1)/i;
        }
        return (int) res;
    }
}