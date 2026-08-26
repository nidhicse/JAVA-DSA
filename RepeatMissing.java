package dsa;

import java.util.Arrays;

public class RepeatMissing {
    
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public static int[] repeatedNumber(final int[] A) {
            int n=A.length;
            int[] count=new int[n+1]; 
            for(int i=0;i<n;i++)
            {
                count[A[i]]++;
            }
            int a=0;
            for(int i=1;i<count.length;i++)
            {
                if(count[i]==2)
                {
                    a=i;
                }
            }
            return new int[]{a,a+1};
        }
        public static void main(String[] args)
        {
            RepeatMissing ob=new RepeatMissing();
            int[] arr={3,1,2,5,3};
            System.out.println(Arrays.toString(repeatedNumber(arr)));
        }
        
    
    
    
}
