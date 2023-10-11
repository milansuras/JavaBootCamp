package ObjectOriented.Student;

public class Main {
    public static void main(String[] args){
        Student milan =new Student(7,"MILAN SURAS ", 77.2f);
        milan.greeting();
        System.out.println(milan.name);
        System.out.println(milan.marks);
    }
}
