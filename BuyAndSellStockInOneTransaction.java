public class BuyAndSellStockInOneTransaction {
    public static void main(String[] args) {
        int arr[] = {5,2,1,9,4,6,3,8};
        int minSoFar = arr[0];
        int maxProfit = 0;
        int profit;

        for(int i=0;i< arr.length;i++){
            minSoFar = Math.min(arr[i],minSoFar);
            profit = arr[i]-minSoFar;
            maxProfit = Math.max(profit,maxProfit);
        }
        System.out.println("Maximum profit is: "+maxProfit);
    }
}
