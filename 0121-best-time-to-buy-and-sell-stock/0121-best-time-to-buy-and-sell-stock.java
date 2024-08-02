class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                int curr=prices[i]-profit;
                profit=Math.max(curr,profit);
            }
        } return profit;
    }
}