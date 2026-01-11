import java.util.Scanner;
public class q3{
     public static abstract class Shape{
        abstract float calculateArea();
    }
    static class Circle extends Shape{
    float calculateArea()
    {   Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float r;
        r=scanner.nextFloat();
        float area;
        area= 3.14f*r*r;
        return area;

    }
    }
    static class Rectangle extends Shape{
        float calculateArea(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int l=scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int b= scanner.nextInt();
        float area;
        area=l*b;
        return area;
        }


    }
    public static void main(String args[])
    {
        Shape obj1=new Circle();
        float a1=obj1.calculateArea();
        System.out.println("Area of circle is: "+a1);
        Shape obj2=new Rectangle();
        float a2=obj2.calculateArea();
        System.out.println("Area of rectangle is: "+a2);

    }
    
}