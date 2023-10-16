package ObjectOriented.StudentChallenge;

public class Student {
    private int roll_no;
    private String name;
    private String department;
    private int numofSubjects;
    private Subject[] subjects;

    // Constructor
    public Student(int roll_no, String name, int numofSubjects) {
        this.roll_no = roll_no;
        this.name = name;
        this.numofSubjects = numofSubjects;
        this.subjects = new Subject[numofSubjects];  // Initialize the subjects array
    }

    // Getter methods
    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getNumofSubjects() {
        return numofSubjects;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    // Setter methods
    public void setDepartment(String department) {
        this.department = department;
    }

    // Fix: Correct the setSubject method
    public void setSubjects(Subject... subs) {
        for (int i = 0; i < numofSubjects; i++) {
            subjects[i] = subs[i];
        }
    }

    // toString method
    public String toString() {
        // Include information about the student's roll number, name, and department
        return "Roll: " + roll_no + "\nName: " + name + "\nDept: " + department;
    }
}
