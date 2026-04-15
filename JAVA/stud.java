package Unit2;
import java.util.Scanner;
class dept{
int roll;String name;Scanner sc=new Scanner(System.in);

void ent(){
    System.out.print("Enter the number of entries:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
    System.out.println("Enter the roll for student"+i+":");
    roll=sc.nextInt();
    System.out.println("Enter the name for student"+i+":");
    name=sc.next();
}          }

void disp(){
    System.out.print("The entries for this dept are:");
    for(int i=1;i<=n;i++){System.out.println("")


    }
}





}


public class stud {
    public static void main(String args[]){

    }
}
