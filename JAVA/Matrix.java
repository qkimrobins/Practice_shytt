import java.util.*;

public class Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int x = sc.nextInt();
        System.out.print("Enter the columns: ");
        int y = sc.nextInt();
        int[][] mat = new int[x][y];
        System.out.println("Now enter the elements:");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat[i][j] = sc.nextInt();   
            }
        }

        System.out.println("Matrix is:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mat[i][j] + " ");  
            }
            System.out.println(); // move to next row
        }
        sc.close();}
}