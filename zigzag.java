package dsa;

public class zigzag {
    public static void diagnol(int[][] mat)
    {   
        // 123
        // 456
        // 789
        // 012
        int rows=mat.length;
        int cols=mat[0].length;
        int t=rows+cols-1;
        for(int d=1;d<=t;d++)
            {
                int sr;
                int sc;
                int ec;
                if(d<=rows)
                    {
                        sr=d-1;
                        sc=0;
                        ec=cols-1;
                    }
                else
                    {
                        sr=rows-1;
                        sc=d+cols-t;
                        ec=cols-1;
                    }
                    
                if(d<=rows)
                {    
                for(int i=sr;i>=0;i--)
                    {
                        System.out.print(mat[i][sc]+" ");
                        sc++;
                    }
                
                System.out.println();
                }
                else{
                    int c=cols-sc;
                    for(int i=sr;i>=c-1;i--)
                        {
                            System.out.print(mat[i][sc]+" ");
                            sc++;
                        }
                    System.out.println();
                }
                
            }


    }
    public static void main(String[] args) {
        zigzag ob=new zigzag();
        int[][] mat={{ 1, 2, 3, 4},{5, 6, 7, 8 },{9, 10, 11, 12},{13, 14, 15, 16},{17, 18, 19, 20}};
        System.out.println("Zigzag pattern of diagnol");
        zigzag.diagnol(mat);

    
    
}
}
