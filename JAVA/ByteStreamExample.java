import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("input.txt");
             FileOutputStream fout = new FileOutputStream("output.txt")) {
            
            int byteData;
            while ((byteData = fin.read()) != -1) {
                fout.write(byteData); // Writing byte by byte
            }
            System.out.println("File copied successfully using Byte Streams.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}