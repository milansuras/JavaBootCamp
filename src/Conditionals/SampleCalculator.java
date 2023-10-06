package Conditionals;
import java.util.Scanner;
public class SampleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("choose the operator given below         "+
                " --------------------------------------------------|" +
                "                                                   |" +
                "          +  , / , * , -                           |" +
                "                                                   |" +
                "---------------------------------------------------|" );
        char ch =sc.next().trim().charAt(0);
        int a,b,sum,sub,multi;
        float div;
        System.out.println("Enter two number:-");
        a=sc.nextInt();
        b=sc.nextInt();

        if(ch=='+'){
            sum=a+b;
            System.out.println(sum);
        }
        else if(ch =='*'){
            multi=a*b;
            System.out.println(multi);
        }
        else if(ch =='-'){
            sub=a-b;
            System.out.println(sub);
        }
        else if(ch == '/'){
            div=(a/b);
            System.out.println(div);
        }
        else
            System.out.println("Enter valid operator");
    }
}
