package medium.besttime2buynsellstockii;

public class Solution {

  /**
   * Say you have an array for which the ith element is the price of
   * a given stock on day i.
   * Design an algorithm to find the maximum profit.
   * @param prices price array
   * @return max profit
   */
  public int maxProfit(int[] prices) {
    if (prices.length == 0 || prices.length == 1) {
      return 0;
    }
    int maxProfit = 0;
    for (int i = prices.length - 1; i > 0; i--) {
      if (prices[i] - prices[i - 1] > 0) {
        maxProfit += prices[i] - prices[i - 1];
      }
    }
    return maxProfit;
  }
}
