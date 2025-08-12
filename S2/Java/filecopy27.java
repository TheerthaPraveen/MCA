import java.util.*;
import java.io.*;

public class filecopy27 
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer=new FileWriter("file3.txt");
            writer.write("hi this is a sample text will this work");
            writer.close();
            System.out.println("File written successfully");
        }
        catch(IOException e)
        {
            System.out.println("Unable to write");
        }

        try
        {
            FileReader reader=new FileReader("file3.txt");
            FileWriter writer=new FileWriter("file4.txt");

            int character;

            while((character=reader.read())!=-1)
            {
                writer.write((char)character);
            }
            System.out.println("File copied successfully");
            reader.close();
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to copy the file");
            System.exit(0);
        }
    }
    
}
