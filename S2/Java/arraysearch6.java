import java.util.*;
class search
{
    Scanner sc=new Scanner(System.in);
    int size,item;
    int arr[];

    void array()
    {
        System.out.println("Enter the size of the array : ");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    void search(search x)
    {
        System.out.println("Enter the element to be searched : ");
        item=sc.nextInt();
        int c=0;
        for(int j=0;j<size;j++)
        {
            if(item==x.arr[j])
            {
                c=j+1;
                System.out.println("The item found at position : "+c);
                break;
            }
        }
    }
}

public class arraysearch6 
{
    public static void main(String[] args)
    {
        search s1=new search();
        s1.array();
        s1.search(s1);
        
    }
}
