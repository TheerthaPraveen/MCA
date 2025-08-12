import java.util.*;
class person
{
    int age;
    String name,address;
    char gender;
    Scanner sc=new Scanner(System.in);

    person(int x)
    {
        System.out.println("---Enter teacher details---");
        System.out.println("Enter name : ");
        name=sc.next();
        System.out.println("Enter address : ");
        address=sc.next();
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("Enter gender (M/F/O)");
        gender=sc.next().charAt(0);
    }
}

class employee extends person
{
    int empid;
    String companyname,qualification;
    double salary;
    Scanner sc=new Scanner(System.in);

    employee(int x)
    {
        super(x);
        System.out.println("Enter the comapny id : ");
        empid=sc.nextInt();
        System.out.println("Enter company name : ");
        companyname=sc.next();
        System.out.println("Enter the qualification : ");
        qualification=sc.next();
        System.out.println("Enter the salary : ");
        salary=sc.nextDouble();
    }
}

class teacher extends employee
{
    String subject,department;
    int teacher_id;
    Scanner sc=new Scanner(System.in);

    teacher(int x)
    {
        super(x);

    }

}





public class multipleinheritance12 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:of teachers : ");
        int n=sc.nextInt();

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
