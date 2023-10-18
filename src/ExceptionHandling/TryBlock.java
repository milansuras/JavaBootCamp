package ExceptionHandling;
import java.util.Scanner;
public class TryBlock {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:-");

            int a = sc.nextInt();
            int b = sc.nextInt();// if i provide zero here it will cause error
            // in mathematics any number divide by zero in infinity but in computers
            // is not defined so to handle exception we have to catch and these are unchecked
            // exception the compiler will not force you to handle it  a demo
            // so what is exception handling to terminate smoothly
        try{
            int c = a / b;

            System.out.println(c);
        }
        catch(ArithmeticException e){

            System.out.println(e.getMessage());
        }
        System.out.println("Terminated smoothly");
    }
}
