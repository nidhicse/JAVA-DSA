package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class multidim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //multidimensional arrays
        int[][] arr={{1,2}, //0th index
        {3,4,5}, //1st index
        {6,7,8,9}}; //2nd index
        //inputting the 2d array
        for(int i=0;i<arr.length;i++)
            {   System.out.println("This is "+i+"th array");
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.println("enter the element");
                    arr[i][j]=sc.nextInt();
                }

            }
        //output of 2d array
        System.out.println("Using the for loop");
        for(int i=0;i<arr.length;i++)
            {
                System.out.println(Arrays.toString(arr[i]));
            }
        //using the enhanced for loops
        System.out.println("Using the enhanced for loop");
        for(int[] num:arr) //each element in arr is itself an array(array of column elements at each index)
            {
              System.out.println(Arrays.toString(num));
            }  
        multidim ob=new multidim();
        
}
}
