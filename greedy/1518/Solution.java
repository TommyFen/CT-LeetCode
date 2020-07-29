/**
* 换酒问题，当前解法不够贪心
*/
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxBottles= numBottles;
        int laveBottles = numBottles;
        while(laveBottles >= numExchange) {
            int newBottles = laveBottles / numExchange;
            maxBottles += newBottles;
            laveBottles = newBottles + (laveBottles % numExchange);
        }
        return maxBottles;
    }
}
