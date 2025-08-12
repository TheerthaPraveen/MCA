import java.util.*;
class employee
{
    int eno;
    double salary;
    String ename;
    Scanner sc=new Scanner(System.in);

    void getdetails()
    {
        System.out.println("Enter the employee number : ");
        eno=sc.nextInt();
        System.out.println("Enter the employee name : ");
        ename=sc.next();
        System.out.println("Enter the employee salary : ");
        salary=sc.nextDouble();
    }
}



public class arrayofobjects8
{
    public static void main(String[] args) 
    {
        int n,search,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:of employees : ");
        n=sc.nextInt();

        employee e[]=new employee[n]; //array of objects

        for(int i=0;i<n;i++)
        {
                e[i]=new employee();
                e[i].getdetails();

        }

        System.out.println("Enter the employee no to search : ");
        search=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(e[i].eno==search)
            {
                flag=1;
                System.out.println("Name is : "+e[i].ename);
                System.out.println("The salary is : "+e[i].salary);
            }

        }
        if(flag==0)
        {
            System.out.println("Employee not found");
        }
        
    }
}
