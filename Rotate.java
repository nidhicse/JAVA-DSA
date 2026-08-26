package dsa;

import java.util.Arrays;

public class Rotate {
    public static void rotate_image(int[][] matrix)
    {
        int n=matrix.length;
        //finding the transpose of a matrix
        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i!=j)
                {
                    int num=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=num;
                }
            }
        }
        //finding the reverse of each row

        for(int i=0;i<n;i++)
        {
            int p1=0;
            int p2=n-1;
            while(p1<p2)
                {
                    int num=matrix[i][p1];
                    matrix[i][p1]=matrix[i][p2];
                    matrix[i][p2]=num;
                    p1++;
                    p2--;
                }
        }

    }
    public static void main(String args[])
    {
        Rotate ob=new Rotate();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original matrix: "+ Arrays.deepToString(matrix));
        Rotate.rotate_image(matrix);
        System.out.println("Rotated matrix: "+Arrays.deepToString(matrix));
    }
    
}
