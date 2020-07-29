/**
*  简单：买卖股票的最佳时机II
*/
class Solution {
    public int maxProfit(int[] prices) {
        //波峰波谷法
        int v = prices[0];
        int p = prices[0];
        int maxProfit = 0;
        int i = 0;
        while(i < prices.length-1) {
            while(i < prices.length-1 && prices[i] >= prices[i+1]) i++;
            v = prices[i];
            while(i < prices.length-1 && prices[i] <= prices[i+1]) i++;
            p = prices[i];

            maxProfit += p - v;
        }
        return maxProfit;

    }
}
