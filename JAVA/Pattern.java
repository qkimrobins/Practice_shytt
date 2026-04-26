public class Pattern {
    public static void main(String[] args) {
        int n = 6; // number of rows

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                // odd rows → print stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // even rows → print numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}