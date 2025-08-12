import java.util.*;

class employee
{
    int empid;
    double esalary;
    String ename,eaddress;
    Scanner sc=new Scanner(System.in);

    employee(int x)
    {
        System.out.println("Enter deatils of teacher : "+x);
        System.out.println("Enter the employee id : ");
        empid=sc.nextInt();
        System.out.println("Enter the employee name : ");
        ename=sc.next();
        System.out.println("Enter the employee address : ");
        eaddress=sc.next();
        System.out.println("Enter the employee salary : ");
        esalary=sc.nextDouble();
    }
}

class teacher extends employee
{
    Scanner sc=new Scanner(System.in);
    String department,subjects[];
    int num;

    teacher(int x)
    {
        super(x);
        System.out.println("Enter the department : ");
        department=sc.next();
        System.out.println("Enter the no:of subjects : ");
        num=sc.nextInt();
        subjects=new String[num];
        System.out.println("Enter the list of subjects : ");
        for(int i=0;i<num;i++)
        {
            subjects[i]=sc.next();
        }  
    }

    void display(int x)
    {
        System.out.println("\n---------TEACHER DETAILS---------");
        System.out.println("\nTeacher "+x+" Details");
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee name : "+ename);
        System.out.println("Employee address : "+eaddress);
        System.out.println("Employee salary : "+esalary);
        System.out.println("Department : "+department);
        System.out.println("Subjects:");
        for(int i=0;i<num;i++)
        {
            System.out.println(subjects[i]+" ");
        }
    }
}

public class singleinheritance11 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:of teachers : ");
        n=sc.nextInt();

        teacher t[]=new teacher[n];
        for(int i=0;i<n;i++)
        {
             t[i]=new teacher(i+1);
        }
           
        for(int i=0;i<n;i++)
        {
            t[i].display(i+1);
        }
            

    }
    
}
