package dsa;

public class kadane1 {
    //finding the maximum subarray using the kadane's algorithm
    public static int maxsubarray(int[]  nums)
    {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
            {
                sum+=nums[i];
                maxsum=Math.max(sum,maxsum);
                if(sum<0) //sum is negative
                {
                    sum=0;
                }
            }
        return maxsum;
    }
    public static void main(String[] args) {
        kadane1 pb=new kadane1();
        int[] arr={1,-2,6,-1,3};
        System.out.println("Maximum subarrray is: "+maxsubarray(arr));
    }
    
}
