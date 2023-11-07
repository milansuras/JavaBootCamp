package ExceptionHandling;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("To handdle error and the rest of the program to be terminate smoothly we use Exception handling");
        System.out.println("Enter number a:-");
        int a=sc.nextInt();
        System.out.println("Enter b:-");
        int b=sc.nextInt();
        try {
            int c = a / b;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage()+ " is not possible");
        }
    }
}
