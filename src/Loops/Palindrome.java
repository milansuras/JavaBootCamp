package Loops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int m=n;
        int rem;
        int rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==m){
            System.out.println("Entered number is palindrome");
        }
        else {
            System.out.println("Entered number is not a palindrome");
        }
    }
}
