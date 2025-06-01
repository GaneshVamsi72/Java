/* 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by 
 * choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit 
 * you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */


/*
 One Traversal Solution - O(n) Time and O(1) Space
In order to maximize the profit, we need to minimize the cost price and maximize the selling price. So at every step, we keep track of the minimum buy price of stock encountered so far. For every price, we subtract with the minimum so far and if we get more profit than the current result, we update the result.
 */
public class BuyAndSellStocksProfit {

    public static int Max_Profit(int[] prices) {
        int buyprice = prices[0], sellprice, maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {

            sellprice = prices[i];

            if (buyprice < sellprice) {
                int profit = sellprice - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = sellprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.print("Maximum profit = " + Max_Profit(prices));
    }
}