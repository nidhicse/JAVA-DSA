package dsa;

import java.util.Arrays;

public class selectionSort {
    public static int[] selection(int[] nums)
    {
        int n=nums.length;
        for(int i=0;i<n-1;i++) //total n-1 iterations
            {  int maxi=0;
                int m=nums[0];
                for(int j=1;j<=n-i-1;j++) //finding the greatest element in the given array
                    {
                        if(nums[j]>m) 
                            {
                                maxi=j; //it holds the index of the largest element
                                m=nums[j];
                            }
                    }
                //greatest element found,now swapping it with the last(last in the given iteration)
                int last=nums[n-i-1]; 
                nums[n-i-1]=m;
                nums[maxi]=last;

            }
        return nums;
    }
    public static void main(String[] args) {
        selectionSort ob=new selectionSort();
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(selection(arr)));
    }
    
}
