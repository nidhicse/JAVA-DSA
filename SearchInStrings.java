package dsa;

public class SearchInStrings {
    public static int Searching(String s,char a)
    {
        if(s==null)
            {
                System.out.println("String is null");
                return -1;
            }
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==a)
                    {   System.out.println("Character found in the string");
                        return i;
                    }
            }
            
        System.out.println("Character not found in the string");
        return -1;
    }
    public static boolean Searching2(String name,char target)
    {
        if(name==null)
            {
                System.out.println("String is null");
                return false;
            }

    //using the for each loop
    for(char c: name.toCharArray())
        {
            if(c==target)
                {
                    return true;
                }
        }
    return false;
    }
    public static void main(String[] args) {
        SearchInStrings ob=new SearchInStrings();
        String str="HelloSunshine";
        char ch='o';
        System.out.println("Character found at index "+Searching(str,ch));
        //searching and returning boolean variables
        System.out.println(Searching2(str,'k'));
       

    }
    
}
