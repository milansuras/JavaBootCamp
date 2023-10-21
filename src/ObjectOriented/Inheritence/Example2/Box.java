package ObjectOriented.Inheritence.Example2;

public class Box {
    int length,width,height;


    public Box(){
        this.length=1;
        this.width=1;
        this.height=1;
    }
    public Box(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public Box(int side){
        this.length=side;
        this.width=side;
        this.height=side;

    }
}
