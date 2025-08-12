
// import java.util.Scanner;

// class NegativeException16 extends RuntimeException
// {
//     NegativeException16(String s)
//     {
//         super(s);
//     }
// }

// public class NegativeNumberCheck
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         int arr[],n,sum=0;

//         System.out.println("Enter the size of the array : ");
//         n=sc.nextInt();
//         arr=new int[n];
//         System.out.println("Enter the array elements : ");
//         try
//         {
//             for(int i=0;i<n;i++)
//             {
//                 arr[i]=sc.nextInt();
//                 if(arr[i]<0)
//                 {
//                     throw new NegativeException16("Negative not allowed");
//                 }
//                 else
//                 {
//                     sum=sum+arr[i];
//                 }
//             }
//         }
//         catch(NegativeException16 e)
//         {
//             System.out.println(e.getMessage());
//             System.exit(0);
//         }
//         System.out.println("The average is : "+(sum/n));

        
//     }
// }

import java.util.*;
class negative extends RuntimeException
{
    negative(String s)
    {
        super(s);
    }
}

public class negativenumber16
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[],n,sum=0;
        System.out.println("Enter the no:of elements : ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements : ");
        try
        {
            for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
            {
                throw new negative("Negative numbers not allowed");
            }
            else
            {
                sum=sum+arr[i];
            }
        }
        
        }
        catch(negative e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        System.out.println("The average is : "+(sum/n));
        
    }
}
