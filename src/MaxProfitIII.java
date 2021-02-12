class Solution123 {
    public int maxProfit(int[] prices) {
        int buy1 = -prices[0];
        int sell1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;
        for (int i = 1; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}

public class MaxProfitIII {
    public static void main(String[] args) {
        Solution123 solution123 = new Solution123();
        int res = solution123.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
        System.out.println(res);
    }
}
