package dsa;

public class RotatedArr2 {
    //another method to search in rotated sorted array
    //here we will directly return the position of the target
    //but this code is not much optimised,finding the pivot and then applying binary search is better approach
    public static int search(int[] nums,int target)
    {  //6,7,0,1,2,3,4,5
        int start=0;
        int end=nums.length-1;
        while(start<=end)
            {
                int mid=start+(end-start)/2;
                
                        if(nums[mid]==target)
                            {
                                return mid;
                            }
                        //checking if left sorted
                        if(nums[start]<=nums[mid]) //left sorted
                            { //now applying binary search
                                if(target>=nums[start] && target<nums[mid])
                                    {
                                        end=mid-1;
                                    }
                                else{
                                    start=mid+1;
                                }
                            }
                        //then right sorted
                        else{
                            //now applying binary search
                            if(target>nums[mid] && target<=nums[end])
                                {
                                    start=mid+1;
                                }
                            else
                                {
                                    end=mid-1;
                                }

                        
                    }
            }
            return -1;
    }
    public static void main(String[] args) {
        RotatedArr2 ob=new RotatedArr2();
        int[] arr={6,7,0,1,2,3,4,5};
        System.out.println(search(arr,0));
    }
}
