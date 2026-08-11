// Last updated: 11/08/2026, 16:09:34
class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0; i<prices.length;i++){
            int profit = 0;
            if(buy_price < prices[i]){
                profit = prices[i] - buy_price;
            }
            if(buy_price > prices[i]){
                buy_price = prices[i];
            }
            if(profit > max_profit){
                max_profit = profit;
            }
        }
        return max_profit;
    }
}