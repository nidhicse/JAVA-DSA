package dsa;

import java.util.Arrays;

public class SearchIn2D {
    public static int search(int[][] num,int target)
    {  SearchIn2D ob=new SearchIn2D();
        if(num==null)
            {
                System.out.println("The array is empty");
                return -1;
            }
            for(int row=0;row<num.length;row++)
                {
                    for(int col=0;col<num[row].length;col++)
                        {
                            if(num[row][col]==target)
                                {
                                    System.out.println("Target found in the array");
                                    return target;
                                }
                        }
                }
            //when target is not found in the array
            System.out.println("Target not found in the array");
            return -1;
    }  

    public static int[] search1(int[][] num,int target)
    {
        if(num==null)
            {
                System.out.println("The array is null");
                return new int[]{-1,-1};
            }
        for(int row=0;row<num.length;row++)
            {
                for(int col=0;col<num[row].length;col++)
                    {
                        if(num[row][col]==target)
                            {
                                return new int[]{row,col};
                            }
                    }
            }
        
            return new int[]{-1,-1};
    }

    public static int min(int[][] num)
    {
        if(num==null)
            {
                return -1;
            }
        int m=Integer.MAX_VALUE;
        //using the for each loop
        for(int[] row:num)
            {
                for(int col:row)
                    {
                        if(col<m)
                            {
                                m=col;
                            }
                    }
            }
        return m;
    }
    
    public static void main(String[] args) {
        SearchIn2D ob=new SearchIn2D();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("2d array:");
        for(int[] a:arr)
            {
                System.out.println(Arrays.toString(a));
            }
        //Finding in the 2d array
        // System.out.println("Element found: "+search(arr,7));
        // System.out.println("Element found: "+search(arr,11));

        //returning the row and col of the target found in the array
        // System.out.println("The target is found at: "+ Arrays.toString(search1(arr,9)));
        // System.out.println("The target is found at: "+ Arrays.toString(search1(arr,100)));
        // //minimum value in the 2d array
        System.out.println("Minimum element: "+min(arr));
        
    }
    
}
