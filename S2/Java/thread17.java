//: Define 2 classes; one for generating multiplication table of 5 and other for displaying first N
//prime numbers. Implement using thread class.

// import java.util.*;

// class multiple extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(i+" * 5 = "+(i*5));
//         }
//     }
// }

// class prime extends Thread
// {
//     int n;
//     prime(int limit)
//     {
//         n=limit;
//     }

//     int isprime(int n)
//     {
//         for(int i=2;i<=n/2;i++)
//         {
//             if(n%i==0)
//             return 0;
//         }
//         return 1;
//     }


//     public void run()
//     {
//         for(int i=1;i<=n;i++)
//         {
//             if(isprime(i)==1)
//             {
//                 System.out.println("prime : "+i);
//             }
//         }
//     }
// }

// public class thread17
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         multiple m=new multiple();
//         System.out.println("Enter the limit for prime number : ");
//         int n=sc.nextInt();
//         prime m1=new prime(n);
//         m.start();
//         m1.start();

        
//     }
// }

import java.util.*;

class multiple extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" * 5 = "+(i*5));
        }
    }
}

class prime extends Thread
{
    int n;
    prime(int limit)
    {
        n=limit;
    }

    int isprime(int n)
    {
        for(int i=0;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }

    public void run()
    {
        for(int i=0;i<=n;i++)
        {
            if(isprime(i)==1)
            {
                System.out.println("Prime number is :"+i);
            }
        }
    }
}

public class thread17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        multiple m=new multiple();
        System.out.println("Enter the limit for generating prime :");
        int n=sc.nextInt();
        prime p=new prime(n);
        m.start();
        p.start();

        
    }
}