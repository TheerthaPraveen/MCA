import java.util.*;
import java.io.*;

public class filereadwrite26 
{
    public static void main(String[] args)
    {
        //write a file
        try
        {
            FileWriter writer=new FileWriter("file1.txt");
            writer.write("hi this is a sample text");
            writer.close();
            System.out.println("File written successfully");
        }
        catch(IOException e)
        {
            System.out.println("Unable to write");
        }

        //to read a file
        try
        {
            FileReader reader=new FileReader("file1.txt");
            int character;
            while((character=reader.read())!=-1)
            {
                System.out.print((char)character);
            }
            reader.close();

        }
        catch(IOException e)
        {
            System.out.println("Unable to read the file");
            System.exit(0);
        }
        
    }
    
}
