import java.util.*;
class shape_area 
{
    void area(int r)
    {
        System.out.println("Area of circle : "+(3-14*r*r));
    }

    void area(float a)
    {
        System.out.println("Area of square : "+(a*a));
    }

    void area(float l,float b)
    {
        System.out.println("Area of rectangle is : "+(l*b));
    }

    void area(double d,double h)
    {
        System.out.println("Area of triangle : "+(0.5*d*h));
    }

}

public class functionoverloading10
{
    public static void main(String[] args) 
    {
      shape_area t=new shape_area();
    int r;
    float a,b,l;
    double d,h;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of the circle : ");
    r=sc.nextInt();
    t.area(r);
    System.out.println("Enter the side of the square : ");
    a=sc.nextFloat();
    t.area(a);
    System.out.println("Enter the length and breadth of recatngle");
    l=sc.nextFloat();
    b=sc.nextFloat();
    t.area(l,b);
    System.out.println("Enter the base and height of the tringle : ");
    d=sc.nextDouble();
    h=sc.nextDouble();
    t.area(d,h); 
    }
    
}
