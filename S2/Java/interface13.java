import java.util.*;
interface shape
{
    public void area();
    public void perimeter();
}

class circle implements shape
{
    double radius;
    circle(double r)
    {
        radius=r;
    }
    public void area()
    {
        System.out.println("Area of the circle is : "+(3.14*radius*radius));
    }

    public void perimeter()
    {
        System.out.println("Perimeter of the circle is : "+(2*3.14*radius));
    }
}

class rectangle implements shape
{
    float length,breadth;
    rectangle(float l,float b)
    {
        length=l;
        breadth=b;
    }
    public void area()
    {
        System.out.println("Area of the rectangle is :"+(length*breadth));

    }
    public void perimeter()
    {
        System.out.println("Perimeter of the rectangle is "+(2*(length+breadth)));
    }
}

public class interface13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("------INTERFACE---------");
            System.out.println("1.Circle\n2.Rectangle\n3.Exit\nEnter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter radius of the circle : ");
                double r=sc.nextDouble();
                circle c=new circle(r);
                c.area();
                c.perimeter();
                break;

                case 2:
                System.out.println("Enter the length of the rectangle : ");
                float l=sc.nextFloat();
                System.out.println("Enter the breadth of the rectangle : ");
                float b=sc.nextFloat();
                rectangle p=new rectangle(l,b);
                p.area();
                p.perimeter();
                break;

                case 3:
                System.out.println("Exited successfully");
                return;

                default:
                System.out.println("Invalid choice");
            }
        }
        
    }
}