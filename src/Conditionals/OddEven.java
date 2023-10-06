package Conditionals;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number integer :-");
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println(num+ " Entered number is even");
        else if(num%2!=0)
            System.out.println(num + " Entered number is odd");
        else
            System.out.println("Enter valid positive number");
    }
}
