import java.util.Scanner;
class name extends RuntimeException
{
    name(String s)
    {
        super(s);
    }
}
class password extends RuntimeException
{
    password(String s)
    {
        super(s);
    }
}
class user
{
    String name,pass;
    user(String name, String pass)
    {
        this.name=name;
        this.pass=pass;
    }
    void login(String n,String p)
    {
        if(name.equals(n) && pass.equals(p))
        {
            System.out.println("Login Successfully!");
        }
        else
        {
            throw new password("Invalid username or password");
        }
    }
}
public class userdefineexcept
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter name :");  
      String name=sc.next();
      if(!name.matches("[a-zA-Z]+"))
      {
        throw new name("Invalid username! Only letters allowed");
      }
      System.out.println("Enter password:");
      String pass=sc.next();
      if(pass.length()<8)
      {
        throw new password("Password must be atleast 8 characters");
      }
      if(!pass.matches(".*\\d.*"))
      {
        throw new password("Password must contain atleast one digit");
      }
      user u=new user(name,pass);
      System.out.println("Login!!");
      System.out.println("Username:");
      String n1=sc.next();
      System.out.println("Password:");
      String n2=sc.next();
      u.login(n1,n2);

    }
}