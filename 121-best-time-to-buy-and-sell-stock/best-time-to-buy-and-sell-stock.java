class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0;i< prices.length; i++){
            int currentPrice = prices[i];

            if(currentPrice < minPrice){
                minPrice = currentPrice;
            } else{
                int Profit = currentPrice - minPrice;
                maxProfit = Math.max(maxProfit,Profit);
            }
        }

        return maxProfit;
    }
}