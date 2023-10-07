package Loops;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input an number:-");
        int n=sc.nextInt();
        int m=n;
        int rem;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n/=10;
        }

        if(sum==m)
            System.out.println("Entered " + m + " Is an armstrong number:-");
        else
            System.out.println("Entered no is not an armstrong number");
    }
}
