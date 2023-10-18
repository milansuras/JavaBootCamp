package MultiThreading.CreatingThread;

 public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        int i=1;
        while(true){
            System.out.println("world");
        }
    }
}
