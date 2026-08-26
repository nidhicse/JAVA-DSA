package dsa;

public class BuyandSell1 {
    public static int MaxProfit(int[] nums)
    {
        //using subarray method
        //7 1 5 3 6 4
        int maxprofit=0;
        int n=nums.length;
        for(int i=0;i<=n-2;i++) //buying day
            {
                for(int j=i+1;j<n;j++) //selling day
                    {
                        if(nums[j]>nums[i])
                            {
                                int profit=nums[j]-nums[i];
                                maxprofit=Math.max(profit,maxprofit);
                            }
                    }
            }
        return maxprofit;

    }
    public static void main(String[] args) {
        BuyandSell1 ob=new BuyandSell1();
        int[] arr={7,1,5,3,6,4};
        System.out.println("Maximum profit: "+MaxProfit(arr));
        
    }
    
}
