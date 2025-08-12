
import java.io.*;

public class FileVowelConsonant {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file1.txt");
            FileWriter writer1 = new FileWriter("vowels.txt");
            FileWriter writer2 = new FileWriter("consonants.txt");

            int character;
            while ((character = reader.read()) != -1)
             {
                    if (character == 'a' || character == 'e' || character == 'i' || 
                        character == 'o' || character == 'u') 
                        {
                        writer1.write((char)character);       // write original character
                    } 
                    else {
                        writer2.write((char)character);   // write original character
                    }
                
            }

            reader.close();
            writer1.close();
            writer2.close();

            System.out.println("Vowels and consonants are written to files.");
        } 
        catch (IOException e) {
            System.out.println("Error while processing files.");
        }
    }
}
