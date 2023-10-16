package ObjectOriented.Inheritence;

public class Cylinder extends Circle{
    public int height;

    public Cylinder(){
        height=2;
    }

    public Cylinder(int height){
        this.height=height;
    }

    public double volume(){
        return area()*height;
    }
}
