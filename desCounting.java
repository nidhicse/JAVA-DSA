package dsa;

import java.util.Arrays;
//3,6,2,1,8,7,4,5,3,1
public class desCounting {
    public static int[] CountingSort(int[] nums)
    {
        int n=nums.length;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) //finding the range of the array
            {
                m=Math.max(nums[i],m);
            }
        int[] count=new int[m+1];
        //traversing the original array and creating the count array
        for(int i=0;i<n;i++)
            {
                count[nums[i]]++;
            }
        //traversing the count array and sorting the original array
        int j=0;
        for(int i=count.length-1;i>=0;i--)
            {
                while(count[i]>0)
                    {
                        nums[j]=i;
                        count[i]--;
                        j++;
                    }
            }
        return nums;
    }
    public static void main(String[] args) {
        desCounting ob=new desCounting();
        int[] arr={3,6,2,1,8,7,4,5,3,1};
        System.out.println("Sorted Array in descending order: "+Arrays.toString(CountingSort(arr)));
    }
    
}
