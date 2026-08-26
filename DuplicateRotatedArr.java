package dsa;

public class DuplicateRotatedArr {
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
                //descending condition in the array
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
                //skipping the duplicate elements and checking if the duplicate elements are pivot
                if(nums[start]==nums[mid] && nums[mid]==nums[end])
                    {//checking if start is the pivot
                        if(start<end && nums[start]>nums[start+1])
                            {
                                return start;
                            }
                            start++;
                    //checking if end-1 is the pivot
                       if(end>0 && nums[end-1]>nums[end])
                        {
                            return end-1;
                        }
                        end--;
                    }
                //checking if left is sorted
                if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end]))
                    {
                        start=mid+1;
                    }
                else //then right is sorted
                {
                    end=mid-1;
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
        DuplicateRotatedArr ob=new DuplicateRotatedArr();
        int[] arr={2,9,2,2,2};
        System.out.println(search(arr,2));
    }
    
}
