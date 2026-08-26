package dsa;

public class RotatedArr {
    public static int search(int[] nums, int target) {
        //firstly we need to find the pivot
        int p=pivot(nums);
        //searching in the first half
        int firsttry=BinarySearch(nums,target,0,p);
        if(firsttry!=-1)
        {
            return firsttry;
        }
        //searching in the second half
        return BinarySearch(nums,target,p+1,nums.length-1);

        
    }
    public static int pivot(int[] nums)
    {
        //finding the pivot element   3,4,5,6,7,0,1,2
        //taking the 4 cases
        int start=0;
        int end=nums.length-1;
        while(start<=end)
            {
                int mid=start+(end-start)/2;
                //mid is the pivot
                if(mid<end && nums[mid]>nums[mid+1])
                    {
                        return mid;
                    }
                //mid is pivot+1
                if(mid>start && nums[mid]<nums[mid-1])
                    {
                        return mid-1;
                    }
                //pivot is not found yet
                if(nums[start]>=nums[mid])
                    {
                        end=mid-1;
                    }
                else if(nums[start]<nums[mid])
                    {
                        start=mid+1;
                    }
            }
            return -1;

        
    }
    public static int BinarySearch(int[] nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        RotatedArr ob=new RotatedArr();
        int[] arr={3,4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
}

    

