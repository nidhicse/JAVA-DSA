package dsa;

public class antidiagnol {
    void print(int[][] mat)
    {   int n=mat.length;
        
        //starting with first row diagnols
        for(int col=0;col<=n-1;col++)
            {
                int i=0;
                int j=col;
                while(i<n && j>=0)
                    {
                        System.out.print(mat[i][j]);
                        i++;
                        j--;
                    }
            }
        
    
        //diagnols starting with 1,n-1 to n-1,n-1
        for(int row=1;row<=n-1;row++)
            {
                int j=n-1;
                int i=row;
                while(i<n && j>=0)
                    {
                        System.out.println(mat[i][j]);
                        i++;
                        j--;
                    }
            }

    }
    public static void main(String args[])
    {
        antidiagnol ob=new antidiagnol();
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        ob.print(mat);
    }

    
}



