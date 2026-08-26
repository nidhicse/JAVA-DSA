package dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class mergesort {
    public static void divide(int[] arr,int low,int high)
    {   //Base case
        if(low>=high)
            {
                return;
            }
        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high) //this loop will iterate till one of the arrays is exhausted
            {
                if(arr[left]<=arr[right])
                    {
                        temp.add(arr[left]);
                        left++;
                    }
                else{
                    temp.add(arr[right]);
                    right++;
                }
            }
        //if right array is exhausted
        while(left<=mid)
            {
                temp.add(arr[left]);
                left++;
                
             }
        //if the left array is exhausted
        while(right<=high)
            {
                temp.add(arr[right]);
                right++;
            }
        for(int i=low;i<=high;i++)
            {
                arr[i]=temp.get(i-low);
            }
        }

    public static void main(String[] args) {
        {   mergesort ob=new mergesort();
            int[] arr={3,1,2,4,1,5,2,6,4};
            int low=0;
            int high=arr.length-1;
            mergesort.divide(arr,low,high);
            System.out.println("Sorted array: "+Arrays.toString(arr));
        }
    }
    
}
