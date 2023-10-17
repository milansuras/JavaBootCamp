package ObjectOriented.DataHiding;

public class Main {
    public static void main(String[] args) {
        Student milan=new Student(7,"M");
        System.out.println(milan.getName());
        System.out.println(milan.getName());
        milan.setName("MILU");
        System.out.println(milan.getName());


    }
}
