package MultiThreading.CreatingThread.Syncnorization;

public class MyThread2 extends Thread {

        Mydata d;

        public MyThread2(Mydata d){
            this.d=d;
        }

        @Override
        public void run(){
            d.display("Welcome");
        }
    }

