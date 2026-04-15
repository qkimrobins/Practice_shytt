package unit1;
import java.util.*;
public class Temp{
  public static void main(String args[]){
int a,b;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the temperature in celcius:");
a=sc.nextInt();
b=(a-32)*5/9;
System.out.println("The converted temperture:"+b);
  }
}
