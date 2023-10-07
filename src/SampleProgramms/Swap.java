package SampleProgramms;

public class Swap {
    public static void main(String[] args){
        System.out.println("Swapping :-");
        int a=10;
        int b=70;

        System.out.println("before swap a=" + a + "and " + "b" + " = " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap a" + " = " +a  + " and " +" b " + " = " + b);
    }
}
