// Problem: Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int i=1; i<prices.length; i++)
        {
            int difference=prices[i]-min;
            maxProfit=Math.max(maxProfit, difference);
            min=Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
