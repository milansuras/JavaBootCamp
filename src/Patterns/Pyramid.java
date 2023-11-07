package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Printing Right half pyramid:-");

        for(int i=1; i<=7; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
