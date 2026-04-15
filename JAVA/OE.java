package unit1;
import java.util.Scanner;
public class OE {
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the num to check:");
	a=sc.nextInt();
	if (a==0){System.out.print("num is zero");}
	else if(a%2==0){System.out.print("num is even");}
	else{System.out.print("Num is odd");}
	sc.close();

  }
}
