package dsa;

public class Sorted {
    public static boolean issorted(int[] nums)
    {
        boolean asc=true;
        boolean desc=true;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                asc=false;
            }
            else if(nums[i]<nums[i+1])
            {
                desc=false;
            }
        }
        if(asc || desc) //either ascending or descending
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Sorted ob=new Sorted();
        int[] arr={5,4,1,2,3};
        System.out.println(issorted(arr));
    }
    
}
