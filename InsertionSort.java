package dsa;

import java.util.Arrays;

public class InsertionSort {
    static int[] Insertion(int[] nums)
    {
        //Insertion sorting algorithm
        int n=nums.length;
        for(int i=0;i<=n-2;i++) //this will run for n-1 times
        {
            for(int j=i+1;j>0;j--)
                {
                    if(nums[j]<nums[j-1])
                        {
                            swap(nums,j,j-1);
                        }
                    else 
                        {
                            break; //lhs is already sorted, so we can surpass this iteration
                        }
                }
        }
        return nums;
    }
    static void swap(int[] nums,int first,int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public static void main(String[] args) {
        InsertionSort ob=new InsertionSort();
        int[] arr=new int[]{5,3,4,1,2};
        System.out.println(Arrays.toString(Insertion(new int[]{56,-23,40,10})));
    }
}
