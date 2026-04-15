class Rob {
    int x, y;
    Rob() {
        System.out.println("This is the default constructor");
        this.x = 2;
        this.y = 3;
    }
    // Parameterized Constructor (Overloading)
    Rob(int x, int y) {
        System.out.println("This is the parameterized constructor");
        this.x = x;
        this.y = y;
    }
    void disp() {
        System.out.println("The result is: " + (x + y));
    }
}
public class Const {
    public static void main(String args[]) {
        Rob r1 = new Rob();
        r1.disp();
        Rob r2 = new Rob(10, 20);
        r2.disp();

    }
}
