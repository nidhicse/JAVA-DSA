package dsa;

import java.util.Arrays;

public class Linear {
    public static int LinearSearch(int[] num,int m)
    {
      int count=0;
      if(num==null)
        {
            return -1;
        }
      for(int i=0;i<num.length;i++)
        {   //count variable will tell how many times the for loop iterates to get the target
            count++;
            if(num[i]==m)
                {
                   System.out.println("The value of count is: "+count);
                   return i; 
                }
        }
        //when the target is  ot found in the array
       System.out.println("Value of count is: "+count);
       return -1;
    }
    public static int LinearSearch2(int[] num,int target)
    {
        if(num==null)
            {
                System.out.println("Array is null");
                return -1;
            }
        for(int a:num) //using for each loop to check each element 
            {
                if(target==a)
                    {   
                        System.out.println("Target found in the array");
                        return a;
                    }
            }
        System.out.println("Target not found in the array");
        return -1;

    }
    public static boolean LinearSearch3(int[] num,int target)
    {
        if(num==null)
            {
                System.out.println("The array is empty");
                return false;
            }
        //using the for each loop
        for(int a:num)
            {
               if(target==a)
                {
                    return true;
                } 
            }
        return false;
    }
    public static boolean LinearSearch4(int[] num,int target,int start,int end)
    {
        if(num==null)
            {
                System.out.println("Null array");
                return false;
            }
        for(int i=start;i<=end;i++)
            {
                if(num[i]==target)
                    {
                        return true;
                    }
            }
        return false;
    }
    public static void main(String[] args) {
        Linear ob=new Linear();
        int[] arr={1,2,3,4,5};
        System.out.println("Original Array: "+Arrays.toString(arr));
        //searching the element using linear search and returning -1 if not found
        //searching the element present in the array
        System.out.println("The element is found at index "+LinearSearch(arr,3));
        //searching the element not present in the array
        System.out.println("The element is found at "+LinearSearch(arr,7));
        //if we want to return the element itself if found in the array
        System.out.println(LinearSearch2(arr,3));
        //if we want the result in boolean values
        System.out.println(LinearSearch3(arr, 2));
        //searching in the range
        System.out.println(LinearSearch4(arr,5,0,3));
        System.out.println(LinearSearch4(arr,2,0,3));

        
    }
}
