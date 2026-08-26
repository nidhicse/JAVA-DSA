package dsa;

import java.util.Arrays;

//3,6,2,1,8,7,4,5,3,1
public class desInsertion {
    public static int[] InsertionSort(int[] nums)
{
        int n=nums.length;
        for(int i=1;i<n;i++)
            {
                if(nums[i]<nums[i-1])
                    {
                        continue;
                    }
                else{ //nums[i] is greater
                    
                    int ind=i;
                    for(int j=i-1;j>=0;j--)
                        {
                            if(nums[j]<nums[ind])
                                {   
                                    int temp=nums[j];
                                    nums[j]=nums[ind];
                                    nums[ind]=temp;
                                    ind=j;
                                }
                        }
                }
            }
    return nums;
}

    public static void main(String[] args) {
        desInsertion ob=new desInsertion();
        int[] arr={3,6,2,1,8,7,4,5,3,1};
        System.out.println("Sorted Array in descending order: "+Arrays.toString(InsertionSort(arr)));
    }
    
}
