package Conditionals;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check:-");
        int year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Entered year is an Leap year");
                }
            }
        }
        else
            System.out.println("Entered year is not leap year");
    }
}
