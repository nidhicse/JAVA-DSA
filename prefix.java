package dsa;

public class prefix {
    //calculating the maximum subarray using prefix array
    public static int maxsubarray(int[] nums)
    {
        //calculating the prefix array
        for(int i=1;i<nums.length;i++)
            {
                nums[i]+=nums[i-1];
            }
        //finding the max subarray
        //sum(start to end)(sum of a subarray)=sum[end]-sum[start-1]
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) //start
            {
                for(int j=i;j<n;j++) //end
                    {   int sum=0;
                        if(i==0) //whenever the subarray starts from the index 0
                            {
                                sum=nums[j];
                            }
                        else{
                            sum=nums[j]-nums[i-1];
                        }
                        maxsum=Math.max(sum,maxsum);
                    }
            }
        return maxsum;
    }
    public static void main(String[] args) {
        prefix ob=new prefix();
        int[] arr={1,-2,6,-1,3};
        System.out.println("Maximum subarrray is: "+maxsubarray(arr));
    }
    
}
