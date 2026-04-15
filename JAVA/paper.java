import java.util.Scanner;
class paper{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
 System.out.println("------Hello there-----");
 System.out.print("Enter the number to check :");
 int n= sc.nextInt();
 if(n%2==0){System.out.print("The number is even");}
 else if(n%2!=0){System.out.print("The number is odd");}
 else{System.out.print("invalid input.");}
 sc.close();
  }
}
