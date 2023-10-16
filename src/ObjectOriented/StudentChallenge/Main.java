package ObjectOriented.StudentChallenge;

public class Main {
    public static void main(String[] args) {
        // Create an array of Subject objects
        Subject[] subs = new Subject[3];

        // Initialize each subject
        subs[0] = new Subject("101", "DATA STRUCTURES AND ALGORITHMS", 100);
        subs[1] = new Subject("102", "OPERATING SYSTEMS", 100);
        subs[2] = new Subject("103", "DEVOPS", 100);

        // Print information about each subject
        for (Subject s : subs) {
            System.out.println(s);
        }
    }
}
