package dsa;

public class Evendigits {
    public static int digits(int num)
    {
        int count=0;
        //to handle the number 0
        if(num==0)
            {
                return 1;
            }

        //to handle the negative numbers
        if(num<0)
            {
                num*=-1;
            }

        while(num>0)
            {
                count++;
                num=num/10;
            }
        return count;
    }

    public static boolean even(int num)
    {
        int count=digits(num);
        if(num==0)
            {
                return false;
            }
        if(count%2==0)
            {
                return true;
            }
        return false;
    }
    //method overloading
    public static int even(int[] num)
    {
        if(num==null)
            {
                return -1;
            }
        int flag=0;
        for(int a:num)
            {
                int count=digits(a);
                if(count%2==0)
                    {
                        //even
                        flag++;
                    }
            }
        return flag;
        
    }
    //optimised function to find the number of digits
    static int digits2(int num)
    {
        //negative numbers
        if(num<0)
            {
                num*=-1;
            }
        return (int)(Math.log10(num))+1;
    }
    public static void main(String[] args) {
        Evendigits ob=new Evendigits();
        //checking whether a number contains even no. digits or not
        System.out.println("Even digits or not: "+even(1250));
        System.out.println("Even digits or not: "+even(125));
        //no. of elements in the array having even no. of digits
        System.out.println("No. of elements having even digits: "+even(new int[]{22,20,1,2,39}));

    }
    
}
