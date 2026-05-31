class Solution{
    public int maxProfit(int[] prices){
        int maxProfit = 0;
        int bestPrice = prices[0];
        for(int i:prices){
            bestPrice = Math.min(bestPrice, i);
            maxProfit = Math.max(maxProfit, i-bestPrice);
        }
        return maxProfit;
    }
}
