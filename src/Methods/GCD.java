package Methods;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number to check m n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(gcd(m,n));


    }
    static int gcd(int m, int n){
        while(m!=n){
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
}
