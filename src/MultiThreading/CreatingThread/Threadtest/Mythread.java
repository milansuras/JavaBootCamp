package MultiThreading.CreatingThread.Threadtest;



public class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    @Override
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
