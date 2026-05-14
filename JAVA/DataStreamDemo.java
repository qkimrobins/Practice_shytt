import java.io.*;
class DataStreamDemo {
public static void main(String[] args) throws Exception {
DataOutputStream dout = new DataOutputStream(new FileOutputStream("data.txt"));
dout.writeInt(100);
dout.writeUTF("Java");
dout.close();
DataInputStream din = new DataInputStream(new FileInputStream("data.txt"));
System.out.println(din.readInt());
System.out.println(din.readUTF());
din.close();
}
}