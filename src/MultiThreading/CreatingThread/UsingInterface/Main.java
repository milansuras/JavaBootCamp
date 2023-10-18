package MultiThreading.CreatingThread.UsingInterface;

public class Main {
    public static void main(String[] args) {
        MyRunnable my=new MyRunnable();
        Thread th=new Thread(my);
         th.start();
        int i=1;
        while(true){
            System.out.println("World!");
        }
    }
}
