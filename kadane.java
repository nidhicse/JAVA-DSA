package dsa;

public class kadane {
    public static int maxsum(int[] nums)
    {
        int n=nums.length;
        int maxs=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<n;i++)
            {
                currsum+=nums[i];
                if(currsum>maxs)
                    {
                        maxs=currsum;
                    }
                if(currsum<0)
                    {
                        currsum=0;
                    }
                
            }
            return maxs;
    }
    public static void main(String[] args) {
        kadane ob=new kadane();
        int[] nums={-1,-2,-3,4,-5};
        System.out.println(maxsum(nums));
    }
}
