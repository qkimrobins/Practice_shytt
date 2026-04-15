package unit1;
import java.util.Scanner;
public class primus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int a = sc.nextInt();
        boolean isPrime = true;
        // Numbers less than 2 are not prime
        if (a < 2) {
            isPrime = false;
        } else {
            // Check divisibility from 2 up to the square root of a
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break;           // Stop the loop early to save time
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " is a Prime Number.");
        } else {
            System.out.println(a + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
