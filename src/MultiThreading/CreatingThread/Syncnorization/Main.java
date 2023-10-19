package MultiThreading.CreatingThread.Syncnorization;

import MultiThreading.CreatingThread.Threadtest.Mythread;

public class Main {
    public static void main(String[] args) {
        Mydata data=new Mydata();

        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);

        t1.start();
        t2.start();

    }
}
