import java.util.Scanner;
public class q2{
    public static class student{
        //Encapsualtion
        private int rollNo,marks;
        private String name;
        public void setDetails(int r,int m,String n){
            this.rollNo= r;
            this.marks= m;
            this.name=n;
        }
        public void displayDetails()
        {   System.out.println("Displaying the details");
            System.out.println("Roll no.: "+rollNo);
            System.out.println("Name: "+name);
            System.out.println("Marks: "+marks);
        }
    }
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the details of the student");
        System.out.println("Roll No.: ");
        int r1=scanner.nextInt();
        System.out.println("Marks: ");
        int m1= scanner.nextInt();
        System.out.println("Name: ");
        scanner.nextLine();
        String n1=scanner.nextLine();
        student obj=new student();
        obj.setDetails(r1,m1,n1);
        obj.displayDetails();
        //Data Hiding 
        //Uncommenting the below lines will give compilation errors
        //System.out.println(obj.rollNo);
        //System.out.println(obj.name);
    }


    }