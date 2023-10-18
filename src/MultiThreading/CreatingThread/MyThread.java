package MultiThreading.CreatingThread;

public class MyThread extends Thread{

    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println("Hello");
            i++;
        }
    }
}
