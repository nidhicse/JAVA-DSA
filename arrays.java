package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        //input data into the array
        System.out.println("Enter the values of the elements in the array");
        for(int i=0;i<arr.length;i++)
            {
                System.out.println("Enter the value");
                arr[i]=sc.nextInt();
            }
        //printing the elements in the array using the for each loop
        for(int num: arr)
            {
                System.out.println(num+" ");
            } 
        System.out.println(Arrays.toString(arr));
        arrays ob=new arrays();

    }
    
}
