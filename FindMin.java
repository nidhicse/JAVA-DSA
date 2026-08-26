package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class FindMin {
    public static int min(int[] num)
    {   //edge case
        if(num==null)
            {
                System.out.println("The array is empty");
                return -1;
            }
        int m=num[0];
        //finding the minimum element in the array
        for(int i=1;i<num.length;i++)
            {
                if(num[i]<m)
                    {
                        m=num[i];
                    }
            }
        return m;
    }
    //method overloading(compile time polymorphism)
    public static int min(int[] num,int start, int end)
    {
        //edge case
        if(num==null)
            {
                System.out.println("The array is empty");
                return -1;
            }
        int m=num[start];
        for(int i=start+1;i<=end;i++)
            {
                if(num[i]<m)
                    {
                        m=num[i];
                    }
            }
        return m;
    }
    public static void main(String[] args) {
        FindMin ob=new FindMin();
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            {
                System.out.println("Enter the element");
                arr[i]=sc.nextInt();
            }
        System.out.println("Original array: "+Arrays.toString(arr));
        //finding the minimum element in the array
        System.out.println("Minimum element: "+min(arr));
        //Finding the min element within a range
        System.out.println("Mimimum element within the given range: "+min(arr,1,3));
    
}
}
