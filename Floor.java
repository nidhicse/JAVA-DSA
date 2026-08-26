package dsa;

public class Floor {
    public static int floor(int[] num,int target)
    {
        int start=0;
        int end=num.length-1;
        //if target is the smaller than the smallest number in the array
        if(target<num[0])
            {
                return -1;
            }
        while(start<=end)
            {
                int mid=start+(end-start)/2;

                if(target==num[mid])
                    {
                        return num[mid];
                    }
                else if(target<num[mid])
                    {
                        end=mid-1;
                    }
                else if(target>num[mid])
                    {
                        start=mid+1;
                    }
            }
            return num[end];
    }
    public static void main(String[] args) {
        Floor ob=new Floor();
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(floor(arr,10));

    }
}


