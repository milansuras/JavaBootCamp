package Patterns;



public class SquareHollow {
    public static void main(String[] args) {

        System.out.println("SQUARE HOLLOW PATTERN");
        // either you can directly apply the ranger or taking input as n =rows
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(i==1 || j==1 || i==7  || j==7){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
