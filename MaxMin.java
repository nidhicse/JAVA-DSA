package dsa;

import java.util.Arrays;

public class MaxMin {
    public static int[] getMinMax(int[] nums,int low,int high)
    {
        //this is the divide and conquer method
        //this is a recursive approach

        //Base case: 1 element 
        if(low==high)
            {
                return new int[]{nums[low],nums[low]};
            }
        //Base case: 2 elements in the array
        if(high==low+1)
            {
                if(nums[low]<nums[high])
                    {
                        return new int[]{nums[low],nums[high]};
                    }
                //else
                return new int[]{nums[high],nums[low]};
            }
        //more than 2 elements, so we will use the recursive approach
        //divide
        int mid=low+(high-low)/2;
        int[] left=getMinMax(nums,0,mid); //recursion
        int[] right=getMinMax(nums,mid+1,high); //recursion
        int min=Math.min(left[0],right[0]);
        int max=Math.max(left[1],right[1]);
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        MaxMin ob=new MaxMin();
        int[] arr=new int[]{3,5,1,8,2,9};
        System.out.println(Arrays.toString(getMinMax(arr,0,5)));
    }
    
}
