public class StocksBuyAndSellMaxProfit {
    public static void main(String[] args) {
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;

         System.out.print("Maximum profit when stocks brought and sold multiple times: "+maxProfit(price, 0, n - 1));
        System.out.println("\nBuy and sell only one transaction at a time:");
         findMaxProfitWithOneTimeBuyAndSell();
    }


    public static int maxProfit(int price[], int start, int end) {

        int maxProfit = 0;

        // The loop starts from 1
        // as its comparing with the previous

        for (int i = 1; i < price.length; i++)
            if (price[i] > price[i - 1])
                maxProfit = maxProfit + price[i] - price[i - 1];
        return maxProfit;
    }

    static void findMaxProfitWithOneTimeBuyAndSell() {
        //int[] arr = {5, 2, 6, 1, 4};
        //int arr[]={7,1,5,3,6,4};
        int arr[]={1,2,5,6,7,9};
        int minSoFar = arr[0];
        int maxProfitSoFar = 0;

        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(arr[i], minSoFar);
            int profit = arr[i] - minSoFar;
            System.out.println("Share with max profit sold for getting profit is: "+profit);
            maxProfitSoFar = Math.max(profit, maxProfitSoFar);
        }
        System.out.println("share with min buy price is: "+minSoFar);

        System.out.println("maximum profit is: "+maxProfitSoFar);
    }
}