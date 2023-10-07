package Methods;
import java.util.Scanner;
public class Prime {
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number to check prime:-");
        int n=sc.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
