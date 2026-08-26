package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class swapping {
    public static void swap(int i,int j,int[] ar1)
    {int temp=ar1[i];
     ar1[i]=ar1[j];
     ar1[j]=temp;
    }
    public static void main(String[] args) {
        swapping ob=new swapping();
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
            {
                System.out.println("Enter the "+i+"th element");
                arr[i]=sc.nextInt();
            }
        //printing the original array
        System.out.println("Original array:");
        for(int num:arr)
            {
                System.out.print(num+",");
            
            }
        System.out.println();
        swap(1,3,arr);
        //printing the modified array
        System.out.println("Array after swapping");
        System.out.println(Arrays.toString(arr));
    }
    
}
