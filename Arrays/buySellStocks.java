public class buySellStocks {
    public static void main(String[] args) {
        int prices[]={7,1,6,3,6,4};
        System.out.println(buySell(prices));
    }
    public static int buySell(int pri[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<pri.length;i++){
            if(buyPrice<pri[i]){
                int profit=pri[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            } else {
                buyPrice =pri[i];
            }
        }
        return maxProfit;
    }
}
