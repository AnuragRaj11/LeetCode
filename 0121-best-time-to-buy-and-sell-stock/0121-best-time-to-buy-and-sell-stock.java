class Solution {
    public int maxProfit(int[] prices) {
        int mn=prices[0];
        int mx=0; 
        for(int i=1;i<prices.length;i++){
            mn=Math.min(mn,prices[i]);
            mx=Math.max(mx,prices[i]-mn);
        }
        return mx;
    }
}