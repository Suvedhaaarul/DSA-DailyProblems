class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0],sell = 0;
        for(int price:prices){
            buy = Math.min(buy,price);
            sell = Math.max(sell,price-buy);
        }
        return sell;
    }
}