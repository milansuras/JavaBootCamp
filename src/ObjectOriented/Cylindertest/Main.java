package ObjectOriented.Cylindertest;

public class Main {
    public static void main(String[] args){
        Cylinder cyli=new Cylinder();
        cyli.setHeight(10);
        cyli.setRadius(7);
        cyli.setDimensions(10,7);
        System.out.println("Area of cylinder is " + cyli.area());
        System.out.println("Area of cylinder is " + cyli.perimeter());
        System.out.println("Volume of cylinder is " + cyli.volume());

        Cylinder cyli2 =new Cylinder(2,7);
        System.out.println("Area of cylinder is " + cyli2.area());
        System.out.println("Area of cylinder is " + cyli2.perimeter());
        System.out.println("Volume of cylinder is " + cyli2.volume());
    }
}
