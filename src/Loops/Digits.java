package Loops;
import java.util.Scanner;
public class Digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :-");
        int n=sc.nextInt();
        int rem;
        while(n>0) {

            rem=n%10;
            n=n/10;
            System.out.println("The digit s are" + rem);
        }
    }
}
