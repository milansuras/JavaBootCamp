package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {

        try{
            readFile("Input.txt");
        }
        catch(IOException e){
            System.out.println("Error to read the file " + e.getMessage());
        }

    }
    private static void readFile(String fileName)throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
