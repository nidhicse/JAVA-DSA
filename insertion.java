package dsa;

import java.util.Arrays;

public class insertion {
    public static int[] insertionsort(int[] nums)
    {   int n=nums.length;
        for(int i=1;i<=n-1;i++)
            {
                if(nums[i]>nums[i-1])
                    {
                        continue;
                    }
                else{
                    int ind=i;
                    for(int j=i-1;j>=0;j--)
                        {
                            if(nums[ind]<nums[j])
                                {
                                    int temp=nums[ind];
                                    nums[ind]=nums[j];
                                    nums[j]=temp;
                                    ind=j;
                                }
                        }
                }
            }
        return nums;
    }
    public static void main(String[] args) {
        insertion ob=new insertion();
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(insertionsort(arr)));
    }
    
}
