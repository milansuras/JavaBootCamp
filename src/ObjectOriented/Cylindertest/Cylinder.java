package ObjectOriented.Cylindertest;

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder(){
        radius=height=1;
    }

    public Cylinder(int radius, int height){
       this.radius=radius;
       this.height=height;
    }

    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        if(h>=0)
            height=h;
        else
            height=0;
    }

    public void setRadius(int r){
        if(r>=0)
            radius=r;
        else
            radius=0;
    }

    public void setDimensions(int h, int r){
        height=h;
        radius=r;
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double volume(){
        return area()*height;
    }
}
