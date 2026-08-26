package dsa;

public class InfiniteArray {
    public static int BinarySearch(int[] nums,int target,int start,int end)
    {
        while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(target==nums[mid])
                    {
                        return mid;
                    }
                else if(target<nums[mid])
                    {
                        end=mid-1;
                    }
                else if(target>nums[mid])
                    {
                        start=mid+1;
                    }
            }
            return -1;
    }
    public static int search(int[] arr,int target)
    {   //initial values of start and end
        int start=0;
        int end=1;
        
        while(target>arr[end])
            {
                int newstart=end+1;
                //end=end+size of box*2
                end=end+(end-start+1)*2;
                start=newstart;
            }
        return BinarySearch(arr,target,start,end);
    }
    public static void main(String[] args) {
        InfiniteArray ob=new InfiniteArray();
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        System.out.println("Position of the target in the infinite array is: "+search(arr,15));
    }
}
