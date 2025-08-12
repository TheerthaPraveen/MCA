import java.io.*;
import java.util.*;

public class dict {
    public static void main(String[] args) 
    throws IOException 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the path of the directory:");
        String dict = sc.nextLine();  // Take the directory path input

        File folder = new File(dict); // Create a File object for the folder

        if (folder.exists() && folder.isDirectory()) {
            System.out.println("Files and directories in the specified directory are:");
            File[] items = folder.listFiles(); // Get list of files/folders

            for (File f : items) {
                System.out.println(f.getName()); // Print each name
            }

            // Ask for the file name to search
            System.out.println("Enter the file name to search:");
            String filename = sc.nextLine();
            boolean found = false;

            for (File f : items) {
                if (f.getName().equals(filename)) {
                    System.out.println("File found at: " + f.getAbsolutePath());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("File '" + filename + "' not found");
            }

        } else {
            System.out.println("Invalid folder");
        }

        sc.close(); // Close the scanner
    }
}