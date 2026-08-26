package dsa;

import java.util.Arrays;

public class Selection {
    static int[] SelectionSort(int[] nums)
    {   //selection sort algorithm
        int n=nums.length;
        int last;
        int maxi;
        for(int i=0;i<=n-2;i++) //this loop will run for total of n-1 times
        {
            last=n-i-1;
            maxi=maxindex(nums,0,last); //index of maximum element in the array or subarray
            swap(nums,maxi,last);

        }
        return nums;
    }
    static int maxindex(int[] nums,int start,int end)
    {
        int m=nums[0];
        int maxi=0;
        for(int i=1;i<=end;i++)
            {
                if(nums[i]>m)
                    {
                        m=nums[i];
                        maxi=i;
                    }
            }
        return maxi;
    }
    static void swap(int[] nums,int first,int second)
    {
        int temp;
        temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public static void main(String[] args) {
        Selection ob=new Selection();
        int[] arr=new int[]{4,5,1,2,3};
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }
    
}
