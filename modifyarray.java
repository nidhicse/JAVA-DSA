package dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class modifyarray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        //printing the array
        System.out.println(Arrays.toString(nums));
        //modifying the array
        changing(nums);
        //printing the modified array nums
        System.out.println(Arrays.toString(nums));
        modifyarray ob=new modifyarray();
    }
    public static void changing(int[] arr)
    {
        arr[1]=10;
        arr[3]=20;
    }
}
