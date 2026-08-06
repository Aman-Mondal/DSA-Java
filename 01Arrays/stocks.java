public class stocks {
    public static int stock(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {23,24,12,67,33,90,12,3,44,1};
        System.out.println("Max Profit : "+stock(prices));

    }
}
