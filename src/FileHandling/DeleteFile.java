package FileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if(myObj.delete()){
            System.out.println("Delete the file: " + myObj.getName());
        }else {
            System.out.println("Fail to delete the file");
        }

    }
}
