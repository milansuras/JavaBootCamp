package Patterns;



public class Square {
    public static void main(String[] args) {
        System.out.println("SQUARE FILL PATTERN");

        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
