package ObjectOriented;

public class Main{
    public static void main(String[] args){
        Circle circle=new Circle();
        circle.radius=7;
        System.out.println(circle.radius);
        System.out.println("Area of circle "+ circle.area());
        System.out.println("Perimeter of circle " + circle.perimeter());
    }
}

class Circle{
    double radius;

    public double area(){
        return 2*Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
