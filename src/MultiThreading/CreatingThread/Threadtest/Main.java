package MultiThreading.CreatingThread.Threadtest;

public class Main {
    public static void main(String[] args) {
        Mythread t=new Mythread("My thread");
        System.out.println("ID :-" + t.getId());
        System.out.println("Priority:- " + t.getPriority());
        System.out.println("Name :-" + t.getName());
        System.out.println("State " + t.getState());
        System.out.println("Is alive " + t.isAlive());
        t.start();
        System.out.println("is alive " +t.isAlive());
    }
}
