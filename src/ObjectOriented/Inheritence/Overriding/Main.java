package ObjectOriented.Inheritence.Overriding;

public class Main {
    public static void main(String[] args) {
        TV tv=new TV();
        tv.ChangeChannel();
        tv.SwitchON();

        TV tv2=new SmartTV();
        tv2.SwitchON();
        tv2.ChangeChannel();

        SmartTV tv3=new SmartTV();
        tv3.Browse();

    }
}
