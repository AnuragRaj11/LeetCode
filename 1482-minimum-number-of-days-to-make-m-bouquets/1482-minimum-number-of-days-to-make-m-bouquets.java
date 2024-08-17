class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int l=1,h=(int) 1e9;
        while(l<h){
            int mid=l+(h-l)/2;
            if(hf(bloomDay,m,k,mid)){
                h=mid;
            }
            else{
                l=mid+1;
            }
        };
            return l;
    }
    private boolean hf(int[] bloomDay,int m, int k,int day){
        int total=0;
        for(int i=0;i<bloomDay.length;i++){
           int  count=0;
            while(i<bloomDay.length && count<k && bloomDay[i]<=day){
                count++;
                i++;
            }
            if(count==k){
                total++;
                i--;
            }
            if(total>=m){
                return true;
            }
        }
            return false;
    }
}