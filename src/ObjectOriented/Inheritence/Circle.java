package ObjectOriented.Inheritence;

public class Circle {
    public double radius;

    public Circle(){
        radius=1;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return 2*Math.PI*radius*radius;
    }
}
