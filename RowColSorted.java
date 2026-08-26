package dsa;

import java.util.Arrays;

public class RowColSorted {
    public static int[] search(int[][] mat,int target)
    {
        int row=0; //for row
        int col=mat[0].length-1; //for column
        while(row<=col)
            {
                if(target==mat[row][col])
                    {
                        return new int[]{row,col};
                    }
                if(target<mat[row][col]) //skip the current column
                    {
                        col--;
                    }
                else //target is greater, so skip the current row
                {
                    row++;
                }

            }
            return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        //the matrix is sorted row wise and column wise but the whole matrix is not strictly sorted
        RowColSorted ob=new RowColSorted();
        int[][] matrix=new int[][]{{10,20,30,40},{15,25,35,45},{28,29,37,49},{3,334,38,50}};
        System.out.println(Arrays.toString(search(matrix,37)));
    }
    
}
