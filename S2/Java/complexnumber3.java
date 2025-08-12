import java.util.Scanner;
class complex
{
    int a,b;

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part : ");
        a=sc.nextInt();
        System.out.println("Enter the imaginary part : ");
        b=sc.nextInt();
    }

    void display()
    {
        System.out.println("The number is "+a+"+"+b+"i");
    }

    void add(complex x,complex y)
    {
        a=x.a+y.a;
        b=x.b+y.b;
    }
}




public class complexnumber3 
{
    public static void main(String[] args) 
    {
        complex c1=new complex();
        complex c2=new complex();
        complex c3=new complex();
        System.out.println("Enter the first complex number : ");
        c1.read();
        System.out.println("Enter the second complex number : ");
        c2.read();
        System.out.println("The first complex number is : ");
        c1.display();
        System.out.println("The second complex number is : ");
        c2.display();
        System.out.println("After addition :");
        c3.add(c1,c2);
        c3.display();
    }
    
}
