package ObjectOriented.Sample;



public class Student2 {
    private int marks;
    private String name;

    public Student2() {
        marks = 1;
        name = "default";
    }

    public Student2(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setname(String name) {
        this.name = name;
    }
}
