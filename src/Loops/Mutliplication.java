package Loops;
import java.util.Scanner;
public class Mutliplication {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num,n;
        System.out.println("Enter num to get multiplication table:-");
         num=sc.nextInt();
        System.out.println("Enter the range :-");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i + " * " + n + " = " + i*num);
        }
    }
}
