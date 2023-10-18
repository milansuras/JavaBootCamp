package ExceptionHandling;

public class Multipletry {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        try{
            int c= a[1]/0;
            System.out.println(c);
            try{
                System.out.println(a[7]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
