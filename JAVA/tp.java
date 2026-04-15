import java.util.*;
public class tp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {  // fixed loop condition
            System.out.print("Enter element: ");
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.println("Elements in the list:");
        for (Integer l : list) {
            System.out.println(l);
        }
        sc.close();
    }
}