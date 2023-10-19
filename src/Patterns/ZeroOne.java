package Patterns;

public class ZeroOne {
    public static void main(String[] args) {
        System.out.println("Printing Zero One trinagle");

        for(int i=1; i<=7; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }

    }
}
