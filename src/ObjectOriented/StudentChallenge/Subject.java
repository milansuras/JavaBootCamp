package ObjectOriented.StudentChallenge;

public class Subject {
    private String subID;
    private String name;
    private int Maxmarks;
    private int marksObtain;

    // Constructor
    public Subject(String subID, String name, int Maxmarks) {
        this.subID = subID;
        this.name = name;
        this.Maxmarks = Maxmarks;
    }

    // Getter methods
    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxmarks() {
        return Maxmarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    // Setter methods with validation
    /**
     * Sets the maximum marks for the subject.
     * @param Maxmarks The maximum marks to set.
     * @throws IllegalArgumentException if Maxmarks is less than or equal to 0.
     */
    public void setMaxmarks(int Maxmarks) {
        if (Maxmarks <= 0) {
            throw new IllegalArgumentException("Maxmarks must be greater than 0");
        }
        this.Maxmarks = Maxmarks;
    }

    /**
     * Sets the marks obtained by the student.
     * @param marksObtain The marks obtained to set.
     * @throws IllegalArgumentException if marksObtain is less than 0 or greater than Maxmarks.
     */
    public void setMarksObtain(int marksObtain) {
        if (marksObtain < 0 || marksObtain > Maxmarks) {
            throw new IllegalArgumentException("Marks obtained must be between 0 and Maxmarks");
        }
        this.marksObtain = marksObtain;
    }

    // Method to check qualification
    boolean isQualified() {
        return marksObtain >= Maxmarks / 10 * 4;
    }

    // toString method
    public String toString() {
        return "\n Subject ID:- " + subID + "\n Name :- " + name + "\n Maxmarks" + Maxmarks;
    }
}
