package ObjectOriented.Inheritence.Example2;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box();
        System.out.println(box1.width + " " + box1.height + " " + box1.length);
        Box box2=new Box(2,5,7);
        System.out.println(box2.length + " " + box2.height + " " + box2.width);
        BoxWeight box3=new BoxWeight();
        System.out.println("Printing boxweight");
        System.out.println(box3.length + " " + " " + box3.height);
        System.out.println(box3.width + "  " + box3.weight);

        BoxWeight box4=new BoxWeight(7,7,7,7);
        System.out.println(box4.length + " " + box4.weight + "  " + box4.height);
        System.out.println(box4.weight);
    }
}
