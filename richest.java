package dsa;

public class richest {

    public static int maxwealth(int[][] accounts)
    {   int[] wealth= new int[accounts.length];
        int max=0;
        int p=0;
        for(int person=0;person<accounts.length;person++)
            {
                int rowsum=0;
                for(int bank=0;bank<accounts[person].length;bank++)
                    {
                        rowsum+=accounts[person][bank];
                    }
                if(rowsum>max)
                    {
                        max=rowsum;
                        p=person;
                    }        
            }
        
        System.out.println("Maximum wealth is: "+max);
        return p;
        
    }
    public static void main(String[] args) {
        richest ob=new richest();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //i-customer, j-banks (row,columns)
        //finding the wealthiest customer
        System.out.println("Wealthiest person is : "+maxwealth(arr));
    }
}
