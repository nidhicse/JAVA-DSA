package dsa;

public class Ceiling {
    public static int ceiling(int[] num,int target)
    {
        int start=0;
        int end=num.length-1;
        //if the target is larger than the largest number in the array
        if(target>num[num.length-1])
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
            return num[start];
    }
    public static void main(String[] args) {
        Ceiling ob=new Ceiling();
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,10));

    }
}
