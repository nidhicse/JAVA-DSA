package dsa;

public class Binary {
    static int BinarySearch(int[] num,int target)
    {
        int start=0;
        int end=num.length-1;
        
        while(start<=end)
            {
                //int mid=start+end/2; might be possible that (start+end) exceed the range of integer
                //better formula
                int mid=start+((end-start)/2);
                if(num[mid]==target)
                    {
                        return mid;
                    }
                else if(num[mid]>target)
                    {
                        end=mid-1;
                    }
                else if(num[mid]<target)
                    {
                        start=mid+1;
                    }

            }
        //element not found
        return -1;
    }
    public static void main(String[] args) {
        Binary ob=new Binary();
        //Binary search
        //array needs to be sorted in Binary Search
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        System.out.println("Target is found at the index: "+BinarySearch(arr,36));
        System.out.println("Target is found at the index: "+BinarySearch(arr,90));
        
    }
    
}
