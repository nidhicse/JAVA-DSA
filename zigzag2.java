package dsa;

public class zigzag2 {
    public void print(int[][] mat)
    {
        int n=mat.length;
        //diagnols starting with first column elements
        for(int row=0;row<=n-1;row++)
            {
                int j=0;
                int i=row;
                while(i>=0 && j<n)
                    {
                        System.out.print(mat[i][j]);
                        i--;
                        j++;
                    }
                System.out.println();
            }
        //diagnols starting with (n-1,1)--(n-1,n-1)
        for(int col=1;col<=n-1;col++)
            {
                int j=col;
                int i=n-1;
                while(i>=0 && j<n)
                    {
                        System.out.print(mat[i][j]);
                        i--;
                        j++;
                    }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        zigzag2 ob=new zigzag2();
        int[][] mat={{ 1, 2, 3, 4},{5, 6, 7, 8 },{9, 10, 11, 12},{13, 14, 15, 16}};
        System.out.println("Zigzag pattern of diagnol");
        ob.print(mat);

    
    
}
    
}
