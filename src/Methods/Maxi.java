package Methods;
import java.util.Scanner;
public class Maxi {
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        maxi(a,b,c);
    }

    static void maxi(int a, int b , int c){
        if(a>b && a>c)
            System.out.println(a + "Is greatest among " + b + " & " + c);

        else if(b>c)
            System.out.println(b+ " Is greatest among " + a + " & " + c);
        else if(a==b && b==c && a==c)
            System.out.println("All are equal");
        else
            System.out.println(c + " Is greatest among "+ a  + "&" + b);

    }
}
