package dsa;
import java.util.Arrays;

public class bubblesort {
    public static int[] bubble(int[] nums)
    {
        //5 4 3 2 1
        int n=nums.length;
        boolean flag=true;
        for(int i=0;i<n-1;i++)
            {
                //one parsing
                for(int j=1;j<=n-i-1;j++)
                    {
                        if(nums[j]<nums[j-1])
                            {
                                int temp=nums[j];
                                nums[j]=nums[j-1];
                                nums[j-1]=temp;
                                //swapping done
                                flag=false;
                            }
                    }
                //if no swapping done till one parsing,then the array is sorted
                if(flag)
                    {   System.out.println("Array alreay sorted");
                        break;
                    }
                
            }
        return nums;
    }
    public static void main(String[] args) {
        bubblesort ob=new bubblesort();
        int[] arr={1,2,3,4,5}; //sorted array
        System.out.println(Arrays.toString(bubble(arr)));
}
}
