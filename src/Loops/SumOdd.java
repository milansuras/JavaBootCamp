package Loops;
import java.util.Scanner;
public class SumOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i+=2){
            sum+=i;
        }
        System.out.println("Sum of odd num in range of " + 1 + " to " + " n " + " =" +sum);

    }
}
