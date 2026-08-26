package dsa;

public class OrderAgnosticBS {
    static boolean Asc(int[] num)
    {
        if(num[0]<num[num.length-1]) //ascending
            {
                return true;
            }
        //descending
        return false;
    }
    static int AgnosticBS(int[] num,int target)
    {
        int start=0;
        int end=num.length;
        while(start<=end)
            {
                int mid=start+((end-start)/2);
                if(num[mid]==target)
                    {
                        return mid;
                    }
                if(Asc(num)) //ascending
                    {
                        if(num[mid]>target) //shift to LHS
                            {
                                end=mid-1;
                            }
                        else if(num[mid]<target) //shift to RHS
                        {
                            start=mid+1;
                        }
                    }
                else //descending
                    {
                        if(num[mid]>target) //shift to RHS
                            {   start=mid+1;
                            }
                        else if(num[mid]<target) //shift to LHS
                        {
                            end=mid-1;
                        }
                    }
            }
        //target not found in the array
        return -1;
    }
    public static void main(String[] args) {
        OrderAgnosticBS ob=new OrderAgnosticBS();
        int[] num1={2,4,6,9,11,12,14,20,36,48};
        int[] num2={90,80,70,56,34,29,15,1};
        System.out.println("Target is found at the index: "+AgnosticBS(num1,14));
        System.out.println("Target is found at the index: "+AgnosticBS(num2,80));
        System.out.println("Target is found at the index: "+AgnosticBS(num2,16));
        
    }
    
}
