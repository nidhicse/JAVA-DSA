package dsa;

import java.util.Arrays;

public class SortedMat {
    public static int[] search(int[][] mat,int target)
    {
        int rstart=0;
        int rend=mat.length-1;
        int rows=mat.length;
        int cols=mat[0].length;
        int cmid=cols/2-1;
        //only one row in the matrix
        if(rows==1)
            {
                return RowBS(mat,0,0,cols-1,target);
            }
        //binary search on rows as well as column
        while(rstart<(rend-1)) //this will ensure that there are more than two rows remaining
            {
                int rmid=rstart+(rend-rstart)/2;
                if(target==mat[rmid][cmid])
                    {
                        return new int[]{rmid,cmid};
                    }
                if(target<mat[rmid][cmid])
                    {
                        rend=rmid;
                    }
                else{
                    rstart=rmid;
                }
            }
            //now two rows are remaining
            //search in the middle column first
            if(target==mat[rstart][cmid])
                {
                    return new int[] {rstart,cmid};
                }
            if(target==mat[rstart+1][cmid])
                {
                    return new int[] {rstart+1,cmid};
                }
            //search in the first half
            if(target<=mat[rstart][cmid-1])
                {
                    return RowBS(mat,rstart,0,cmid-1,target);
                }
            //search in the second half
            if(target>=mat[rstart][cmid+1] && target<=mat[rstart][cols-1])
                {
                    return RowBS(mat,rstart,cmid+1,cols-1,target);
                }
            //search in the third half
            if(target<=mat[rstart+1][cmid-1])
                {
                    return RowBS(mat,rstart+1,0,cmid-1,target);
                }
            //search in the fourth half
            if(target>=mat[rstart+1][cmid+1] && target<=mat[rstart+1][cols-1]){
                return RowBS(mat,rstart+1,cmid+1,cols-1,target);
            }
        //element not found in the matrix
        return new int[] {-1,-1};
    }
    static int[] RowBS(int [][] mat,int row,int cstart,int cend,int target)
    { //binary search in a particular row
        while(cstart<=cend)
            {
                int cmid=cstart+(cend-cstart)/2;
                if(target==mat[row][cmid])
                    {
                        return new int[] {row,cmid};
                    }
                if(target<mat[row][cmid])
                    {
                        cend=cmid-1;
                    }
                else  //target>element
                {
                    cstart=cmid+1;
                }
            }
            return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        //the matrix is strictly sorted
        SortedMat ob=new SortedMat();
        int[][] matrix=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(search(matrix,5)));
    }
    
}
