package Loops;
import java.util.Scanner;
public class Words {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int rem;
        String str="";

        while(n!=0){
            rem=n%10;
            n/=10;
            str=str+rem;
        }
        System.out.println(str);

        // convert digits into words
        char c;
        for(int i=str.length()-1; i>=0; i--){
            c=str.charAt(i);
            switch(c)
            {
                case '0': System.out.print(" Zero ");
                break;
                case '1' : System.out.print(" one ");
                break;
                case '2': System.out.print(" two ");
                break;
                case'3' : System.out.print(" three ");
                break;
                case'4' : System.out.print(" four " );
                break;
                case '5': System.out.print(" Five ");
                break;
                case'6': System.out.print(" Six ");
                break;
                case '7' : System.out.print(" Seven ");
                break;
                case'8': System.out.print( " Eight ");
                break;
                case '9': System.out.print(" Nine ");
                break;
            }
        }

    }
}
