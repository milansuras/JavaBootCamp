package Loops;
import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number:-");
        long  num=sc.nextInt();
        long m=num;
        int count=0;

        while(num!=0){
             num=num/10;
            count++;
        }
        System.out.println("No of digits in the " + m + " are " + count);
    }
}
