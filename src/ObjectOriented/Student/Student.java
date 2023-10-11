package ObjectOriented.Student;

public class Student {
    int roll_no;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello " + this.name);
    }

    public Student(int roll_no, String name, float marks){
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
    }
}
