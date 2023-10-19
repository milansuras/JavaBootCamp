package Patterns;

public class TriangleStar {
    public static void main(String[] args) {
        System.out.println("TRIANGLE STAR PATTERN");

        for(int i=1; i<=7; i++){
            for(int k=7-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
