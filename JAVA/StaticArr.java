import java.util.*;
public class StaticArr{
    public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.print("Enter the number of element for the array:");
int n= sc.nextInt();
int [] nums= new int[n];
System.out.print("Enter the elements for the array now:");
for(int i=0;i<n;i++){
    nums[i]=sc.nextInt();
}

for(int i=0;i<n;i++){
    System.out.println(nums[i]);
}
sc.close();

    }
}
