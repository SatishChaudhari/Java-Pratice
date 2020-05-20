package FileHandling;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Now you can write through programme");
            myWriter.close();
            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();

        }
    }
}
