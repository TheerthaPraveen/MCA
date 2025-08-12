import java.util.*;

abstract class shape
{
    abstract void area();
    abstract void perimeter();
}

class circle extends shape
{
    int r;
    circle(int radius)
    {
        r=radius;
    }
    public void area()
    {
        System.out.println("The area of the circle is : "+(3.14*r*r));
    }
    public void perimeter()
    {
        System.out.println("The perimeter of the circle is : "+(2*3.14*r));
    }
}

class rectangle extends shape
{
    int l,b;
    rectangle(int length,int breadth)
    {
        l=length;
        b=breadth;
    }
    public void area()
    {
        System.out.println("The area of the rectangle : "+(l*b));
    }
    public void perimeter()
    {
        System.out.println("The perimeter of the rectangle : "+(2*(l+b)));
    }
}

public class abstract1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("1.circle\n2.rectangle\n3:exit\nEnter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the radius of the rectangle : ");
                int radius=sc.nextInt();
                circle c=new circle(radius);
                c.area();
                c.perimeter();
                break;

                case 2:
                System.out.println("Enter the length of the rectangle : ");
                int length=sc.nextInt();
                System.out.println("Enter the breadth of the rectangel : ");
                int breadth=sc.nextInt();
                rectangle z=new rectangle(length,breadth);
                z.area();
                z.perimeter();
                break;

                case 3:
                System.out.println("Exites successfully");
                return;

                default:
                System.out.println("Enter a valid choice");
            }
        }
        
    }
}
