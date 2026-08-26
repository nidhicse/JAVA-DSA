package dsa;

import java.util.Arrays;

public class setzeroes {
    public void set(int[][] mat)
    {
        int rows=mat.length;
        int cols=mat[0].length;
        int col0=1;
        for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                    {
                        if(mat[i][j]==0)
                            {
                                //marking row
                                mat[i][0]=0;
                                //marking column
                                if(j!=0) //except first column
                                    {
                                        mat[0][j]=0;
                                    }
                                else //if j=0
                                    {
                                        col0=0;

                                }
                            }
                    }
            }
            //setting rows and columns
            for(int i=1;i<rows;i++)
                {
                    for(int j=1;j<cols;j++)
                        { 
                            if(mat[i][0]==0 || mat[0][j]==0)
                                {
                                    mat[i][j]=0;
                                }
                        }
                }
            //setting the first row
            if(mat[0][0]==0)
                {
                    for(int j=0;j<cols;j++)
                        {
                            mat[0][j]=0;
                        }
                }
            //setting the first column
            if(col0==0)
                {
                    for(int i=0;i<rows;i++)
                        {
                            mat[i][0]=0;
                        }
                }
            System.out.println(Arrays.deepToString(mat));
    }
    public static void main(String[] args) {
        setzeroes ob=new setzeroes();
        int[][] mat={{1,1,1},{1,0,1},{1,1,1}};
        ob.set(mat);

    }
    
}
