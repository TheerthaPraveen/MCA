import java.util.*;
class Cpu 
{
    int price;
    Scanner sc=new Scanner(System.in);

    class processor
    {
        int cores;
        String manufacturer;

        processor()
        {
            System.out.println("Enter the no:of cored needed : ");
            cores=sc.nextInt();
            System.out.println("Enter the manufactuirer : ");
            manufacturer=sc.next();
        }
    }

    static class ram
    {
        Scanner sc=new Scanner(System.in);
        int memory;
        String manufacturer;

        ram()
        {
            System.out.println("Enter the memory capacity needed : ");
            memory=sc.nextInt();
            System.out.println("Enter the memory manufacturer : ");
            manufacturer=sc.next();

        }
    }
}



public class innerclass5 
{
    public static void main(String[] args) 
    {
        Cpu c=new Cpu();
        Cpu.processor p=c.new processor();
        Cpu.ram r=new Cpu.ram();
        c.price=2500+(p.cores*20)+(r.memory*15);
        System.out.println("\nPROCESSOR DETAILS\nNo:of cores:"+p.cores+"\nManufacturer:"+p.manufacturer);
        System.out.println("\nRAM DETAILS\nMemory Capacity:"+r.memory+"\nManufacturer:"+r.manufacturer);
        System.out.println("\nTotal price of CPU : "+c.price);

        
    }   
}
