import java.util.Scanner;
public class hcf_lcm {
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int hcf) {
        return (a * b) / hcf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        // Step 1: Calculate HCF
        int hcf = findHCF(num1, num2);

        // Step 2: Calculate LCM using the formula
        int lcm = findLCM(num1, num2, hcf);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        sc.close();
    }
}
