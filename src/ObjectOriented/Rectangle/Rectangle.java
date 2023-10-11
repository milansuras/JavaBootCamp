package ObjectOriented.Rectangle;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
