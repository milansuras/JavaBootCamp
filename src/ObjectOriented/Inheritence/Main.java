package ObjectOriented.Inheritence;

public class Main {
    public static void main(String[] args){
        Cylinder cyli=new Cylinder();
        System.out.println(cyli.height + " " +  cyli.radius);// it will call non paramaterized constructor
        System.out.println(" area" + cyli.area()+ " volume" +  cyli.volume());//

        Circle circle=new Circle();
        System.out.println(circle.radius);
        System.out.println(circle.area());

    }
}
