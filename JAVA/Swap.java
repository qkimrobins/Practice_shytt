package unit1;
public class Swap {
public static void main(String[] args) {
    int a,b,temp;
    a=10;
    b=20;
    System.out.println("Before swapping: a="+a+" b="+b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping: a="+a+" b="+b);
}
}
