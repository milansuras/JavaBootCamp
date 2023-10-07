package Loops;
import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first term(x), common difference(d) and the range(n)");
        int x=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int term=x;
        for(int i=1; i<=n; i++){
            System.out.print(term + " ," );
            term+=d;
        }
    }
}
