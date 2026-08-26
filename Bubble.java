package dsa;

import java.util.Arrays;

public class Bubble {
    static int[] BubbleSort(int[] nums)
    {
        //Bubble sort algorithm
        int n=nums.length;
        boolean flag;
        for(int i=0;i<n-1;i++) //there will total of n-1 parses
            {   //particular parsing
                flag=false; //to check whether swapping has been done or not in a particular parsing
                for(int j=1;j<=n-i-1;j++)
                    {  //one iteration of j
                        int temp=0;
                        if(nums[j]<nums[j-1])
                            {
                                temp=nums[j];
                                nums[j]=nums[j-1];
                                nums[j-1]=temp;
                                flag=true;
                            }
                        
                    }
                    if(!flag) //flag is false, so no swapping done,hence array has been sorted
                        {
                            break;
                        }

            }
            return nums;
    }
    public static void main(String[] args) {
        Bubble ob=new Bubble();
        int[] arr=new int[]{3,1,5,4,2};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
    
}
