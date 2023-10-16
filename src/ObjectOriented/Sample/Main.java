package ObjectOriented.Sample;



public class Main {
    public static void main(String[] args) {
        Student2 milan = new Student2(7, "MILAN ");
        System.out.println(milan.getMarks()); // Corrected
        System.out.println(milan.getName());  // Corrected

        milan.setMarks(10);
        milan.setname("milan");  // Corrected

        int updatedMarks = milan.getMarks();  // Corrected
        String updatedName = milan.getName(); // Corrected

        System.out.println(updatedMarks);
        System.out.println(updatedName);
    }
}

