import java.util.Scanner;
//Done Inheritance
class Parent {
    int roll;
    Scanner sc = new Scanner(System.in);
    void entRoll() {
        System.out.print("Enter the roll: ");
        roll = sc.nextInt();
    }
}
class Parent2 extends Parent {
    String name;
    void entName() {
        System.out.print("Enter the name: ");
        name = sc.next();
    }
}
class End extends Parent2 {
    void disp() {
        System.out.println("The roll number of the student is " + roll + " and the name is " + name);
    }
}
public class Inh {
    public static void main(String[] args) {
        End e1 = new End();
        e1.entRoll();
        e1.entName();
        e1.disp();
    }
}
