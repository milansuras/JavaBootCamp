package Methods;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a and b:-");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int ans=sum(a,b);
        System.out.println("Sum of " + a + " + " + b + " = " + ans);
    }
    static int sum(int a,int b){
        return a+b;
    }
}
