package unit1;
public class Larg {
    public static void main(String args[]) {
        int a = 2, b = 4, c = 6;
        System.out.println("---------- Largest Number Finder ----------");
        System.out.println("Comparing: " + a + ", " + b + ", and " + c);
        if (a > b && a > c) {
            System.out.println("a (" + a + ") is the largest");
        }
        else if (b > a && b > c) {
            System.out.println("b (" + b + ") is the largest");
        }
        else if (c > a && c > b) {
            System.out.println("c (" + c + ") is the largest");
        }
        else {
            System.out.println("The numbers are equal or there is a tie.");
        }
    }
}
