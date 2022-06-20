class Solution122 {
    public int maxProfit(int[] prices) {
        int sell=0, buy=0;
        int profit=0;
        if(prices.length==1){
            return 0;
        }
        for(int i=0;i<prices.length-1;i++){
                        while (i < prices.length-1 && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];

            while (i < prices.length-1 && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;
    }
}