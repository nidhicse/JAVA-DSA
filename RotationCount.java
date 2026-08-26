package dsa;

public class RotationCount {
    public static int count(int[] nums)
    {
        //finding the pivot
        int p=pivot(nums);
        //if the array is not rotated
        if(p==-1)
            {
                return 0;
            }
        return p+1;
    }
    public static int pivot(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
            {
                int mid=start+(end-start)/2;
                //mid is the pivot
                if(nums[mid]>nums[mid+1])
                    {
                        return mid;
                    }
                //mid-1 is the pivot
                else if(nums[mid-1]>nums[mid])
                    {
                        return mid-1;
                    }
                //checking if left sorted
                if(nums[start]<nums[mid])
                    {
                        start=mid+1;
                    }
                else //right sorted
                {
                    end=mid-1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        RotationCount ob=new RotationCount();
        int[] arr={5,6,7,1,2,3};
        System.out.println(count(arr));
    }
    
}
