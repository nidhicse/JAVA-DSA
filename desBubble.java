package dsa;
//sorting the array in the descending order
//3,6,2,1,8,7,4,5,3,1

import java.util.Arrays;

public class desBubble {
    public static int[] BubbleSort(int[] nums)
    {
        int n=nums.length;
        for(int i=0;i<=n-2;i++) //total parses
            {
                for(int j=1;j<=n-i-1;j++)
                    {
                        if(nums[j]>nums[j-1])
                            {
                                int temp=nums[j-1];
                                nums[j-1]=nums[j];
                                nums[j]=temp;
                            }
                    }
            }
        return nums;
    }
    public static void main(String[] args) {
        desBubble ob=new desBubble();
        int[] arr={3,6,2,1,8,7,4,5,3,1};
        System.out.println("Sorted Array in descending order: "+Arrays.toString(BubbleSort(arr)));
    }
}
