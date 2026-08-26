package dsa;

import java.util.Arrays;

public class maximum {
    public static int max(int[] num)
    {
        int m=num[0];
        for(int i=1;i<num.length;i++)
            {
                if(num[i]>m)
                    {
                      m=num[i];
                    }
            }
        return m;
    }
    public static void swap(int i,int j,int[] ar1)
    {int temp=ar1[i];
     ar1[i]=ar1[j];
     ar1[j]=temp;
    }
    public static int[] reverse(int[] num)
    {
        int start=0;
        int end=num.length-1;
        int[] num1=num;
        while(start<end)
            {
                swap(start,end,num1);
                start++;
                end--;
            }
        return num1;
    }
   public static void main(String[] args) {
    maximum ob=new maximum();
    int[] arr={10,100,90,120,70};
    System.out.println("Original array: "+Arrays.toString(arr));
    //maximum element
    System.out.println("The maximum element in the array is:");
    System.out.println(max(arr));
    //reversing the array
    System.out.println("Reversed array");
    int [] num1=reverse(arr);
    System.out.println(Arrays.toString(num1));
    int[] ar2={1,2,3,4,5,6};
    int [] num2=reverse(ar2);
    System.out.println(Arrays.toString(num2));
   } 
    
}
