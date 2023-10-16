package ObjectOriented.CircleExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating an object of  Circle class ");
        Circle circle=new Circle(10);
        System.out.println("Area of circle is " + circle.area());
        System.out.println("Perimeter of circle is " + circle.perimeter());

    }
}
