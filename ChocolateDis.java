package dsa;

import java.util.Arrays;

public class ChocolateDis {
    static int packet(int[] nums,int k)
    {
        //k is the number of students
        Arrays.sort(nums);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i+(k-1)<nums.length;i++)
            {
                int diff=nums[i+k-1]-nums[i];
                if(diff<mindiff)
                    {
                        mindiff=diff;
                    }
            }
            return mindiff;
            

    }
    public static void main(String[] args) {
        ChocolateDis ob=new ChocolateDis();
        int[] arr={7,3,2,4,9,12,56};
        System.out.println(packet(arr,3));
    }
    
}
