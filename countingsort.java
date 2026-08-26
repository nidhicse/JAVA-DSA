package dsa;

import java.util.Arrays;

public class countingsort {
    public static int[] countings(int[] nums)
    {
        //finding the largest element
        int largest=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
            {
                if(nums[i]>largest)
                    {
                        largest=Math.max(nums[i],largest);
                    }
            }
        //creating a count array storing frequency of 0 to largest
        int[] count=new int[largest+1];
    
        //traversing through the original array and storing the frequencies in count array
        for(int i=0;i<n;i++)
            {
                count[nums[i]]++;
            }
        //sorting and storing in the original array
        //traversing through count
        int j=0; //j is the pointer of the nums array(original array)
        for(int i=0;i<count.length;i++)
            {  
                while(count[i]>0)
                    {
                        nums[j]=i;
                        j++;
                        count[i]--;
                    }
            }
        return nums;

    }
    public static void main(String[] args) {
        countingsort ob=new countingsort();
        int[] arr={1,4,1,3,2,4,3,7};
        System.out.println(Arrays.toString(countings(arr)));
    }
}
