//define a class product with data members pcode,pname,price. Create 3 objects of the class and find the product having the lowest price
//LAB RECORD PROGRAM 1

import java.util.Scanner;
class product 
{
    int pcode,price;
    String pname;

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product code : ");
        pcode=sc.nextInt();
        System.out.println("Enter the name of the product : ");
        pname=sc.next();
        System.out.println("Enter the product price : ");
        price=sc.nextInt();

    }

    void display()
    {
        System.out.println("The product code is "+pcode);
        System.out.println("The product name is "+pname);
        System.out.println("The product price is "+price);
    }

    void lowest(product p1,product p2,product p3)
    {
        if(p1.price<p2.price && p1.price<p3.price)
        {
            p1.display();
        }
        else
        {
            if(p2.price<p3.price)
            {
                p2.display();
            }
            else
            {
                p3.display();
            }
        }
    }
}

public class lowestproduct1
{
    public static void main(String[] args)
    {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        product p4=new product();

        System.out.println("Enter the first data : ");
        p1.read();
        System.out.println("Enter the second data : ");
        p2.read();
        System.out.println("Enter the third data : ");
        p3.read();
        System.out.println("The product with lowest price is : ");
        p4.lowest(p1,p2,p3);
        
    }

}