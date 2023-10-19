package MultiThreading.CreatingThread.Syncnorization;

public class MyThread1 extends Thread{
    Mydata d;

    public MyThread1(Mydata d){
        this.d=d;
    }

    @Override
    public void run(){
        d.display("Hello World");
    }
}
