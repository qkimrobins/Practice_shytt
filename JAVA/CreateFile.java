import java.io.*;
class CreateFile {
 public static void main(String[] args) {
 try {
 File f = new File("data.txt");
 if(f.createNewFile()) {
 System.out.println("File created");
 } else {
 System.out.println("Already exists");
 }
 } catch(Exception e) {
 System.out.println(e);
 }
 }
}
