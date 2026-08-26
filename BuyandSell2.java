package dsa;

public class BuyandSell2 {
    public static int MaxProfit(int[] nums)
    {
        int maxprofit=0;
        int buyprice=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
            {
                if(nums[i]>buyprice)
                    {
                        int profit=nums[i]-buyprice;
                        maxprofit=Math.max(profit,maxprofit);
                    }
                else{
                    buyprice=nums[i];
                }
            }
        return maxprofit;
    }
    public static void main(String[] args) {
        BuyandSell2 ob=new BuyandSell2();
        int[] arr={7,1,5,3,6,4};
        System.out.println("Maximum profit: "+MaxProfit(arr));
    }
    
}
