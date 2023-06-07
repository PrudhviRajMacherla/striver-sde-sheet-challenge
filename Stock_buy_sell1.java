public class Stock_buy_sell1{
    public static int bruteforce(int[] prices)
    {
        //for every price find greater price on next day's to make profit and sell
       int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            int profit=0;
            for(int j=i;j<prices.length;j++)
            {
                int val=prices[j]-prices[i];
                if(val>profit){
                    profit=val;
                }
            }
            maxprofit=Math.max(maxprofit,profit);
        }
       // System.out.println("Maximum profit is:"+maxprofit);
       return maxprofit;
    }
    public static int optimal(int[] prices)
    {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            int profit=prices[i]-minprice;
            maxprofit=Math.max(maxprofit,profit);
        }
      //  System.out.println("Maximum profit is:"+maxprofit);
      return maxprofit;
    }
    public static void main(String[] args)
    {
        int[] prices={7,1,5,3,6,4};
        System.out.println("Solution From Brute Force"+bruteforce(prices));
        System.out.println("Solution From Optimal "+optimal(prices));
    }
}