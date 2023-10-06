package Loops;
import java.util.Scanner;
public class SumEven {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range to check the sum:");
         int n=sc.nextInt();
         int sum=0;
         for(int i=0; i<=n; i+=2){
             sum+=i;
         }
         System.out.println("The sum of even num  in range of " + 0 + " to " + n + " = " +sum);
    }
}
