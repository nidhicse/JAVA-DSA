package dsa;

import java.util.Arrays;
//descending order selection sort
//3,6,2,1,8,7,4,5,3,1
public class desSelection {
    public static int[] SelectionSort(int[] nums)
    {
        int n=nums.length;
        for(int i=0;i<=n-2;i++) //total number of parses
            {   int m=nums[0];
                int ind=0;
                for(int j=1;j<=n-i-1;j++) //finding the smallest element in an individual parse
                    {   
                        if(nums[j]<m)
                            {
                                ind=j; 
                                m=nums[j];
                            }
                    }
                int temp=nums[n-i-1]; 
                    nums[n-i-1]=nums[ind];
                    nums[ind]=temp;
            }
        return nums;
    }
    public static void main(String[] args) {
        desSelection ob=new desSelection();
        int[] arr={3,6,2,1,8,7,4,5,3,1};
        System.out.println("Sorted Array in descending order: "+Arrays.toString(SelectionSort(arr)));
    }
    
}
