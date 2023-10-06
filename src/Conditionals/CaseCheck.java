package Conditionals;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any charachter:-");
        char ch=sc.next().trim().charAt(0);
        if(ch >='a' && ch <='z'){
            System.out.println("Entered charachter is lowercase");
        }
        else
            System.out.println("Entered charachter is uppercase");

    }
}
