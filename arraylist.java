package dsa;
import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        arraylist ob=new arraylist();
        Scanner sc=new Scanner(System.in);
        // ArrayList<Integer> arl=new ArrayList<>();//can provide the initial size here
        // for(int i=0;i<10;i++)
        //     {
        //        System.out.println("Enter the element");
        //        arl.add(sc.nextInt());
        //     }
        // System.out.println(arl);
        ArrayList<ArrayList<Integer>> arl=new ArrayList<>();
        //initialization
        for(int i=0;i<3;i++)
            {
                arl.add(new ArrayList<>());
            }
        //inputting the two dimensional array
        for(int i=0;i<3;i++)
            {   System.out.println("This is "+i+"th arraylist");
                for(int j=0;j<3;j++)
                    {   System.out.println("Enter the element");
                        arl.get(i).add(sc.nextInt());
                    }
            }
        //printing the 2d arraylist
        System.out.println(arl);
    }
}
