import java.util.*;
import java.io.*;

public class fileoddoreven28 
{
    public static void main(String[] args)
    {
        try
        {
            FileReader reader=new FileReader("file1.txt");
            FileWriter writer1=new FileWriter("odd.txt");
            FileWriter writer2=new FileWriter("even.txt");

            int character;
            while((character=reader.read())!=-1)
            {
                if(character%2==0)
                {
                    writer2.write(character);
                }
                else
                {
                    writer1.write(character);
                }
            }
            reader.close();
            writer1.close();
            writer2.close();
        }
        catch(IOException e)
        {
            System.out.println("unable to move the contents");
            System.exit(0);
        }
        
    }
}

// import java.util.*;
// import java.io.*;

// public class fileoddoreven28 {
//     public static void main(String[] args) {
//         try {
//             FileReader reader = new FileReader("file1.txt");
//             FileWriter writer1 = new FileWriter("odd.txt");
//             FileWriter writer2 = new FileWriter("even.txt");

//             int character;
//             while ((character = reader.read()) != -1) {
//                 if (Character.isDigit((char) character)) {
//                     int digit = character - '0';
//                     if (digit % 2 == 0) {
//                         writer2.write(character);  // even digit
//                     } else {
//                         writer1.write(character);  // odd digit
//                     }
//                 }
//             }
//             reader.close();
//             writer1.close();
//             writer2.close();
//         } catch (IOException e) {
//             System.out.println("unable to move the contents");
//             System.exit(0);
//         }
//     }
// }
