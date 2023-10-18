package ExceptionHandling;

class NegativeDimensionException extends Exception {
    @Override
    public String toString() {
        return ("Dimensions cannot be less than zero:-");
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        meth1();
    }

    static void meth1() {
        try {
            System.out.println("Area of rectangle is:-" + area(10, 5));
        } catch (NegativeDimensionException e) {
            System.out.println(e.toString());
        }
    }

    static int area(int l, int b) throws NegativeDimensionException {
        if (l <= 0 || b <= 0)
            throw new NegativeDimensionException();

        return l * b;
    }
}
