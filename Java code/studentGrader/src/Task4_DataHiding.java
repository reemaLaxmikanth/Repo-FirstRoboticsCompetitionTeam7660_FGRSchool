


import java.util.Scanner;
import Student_dataHiding.Student_dataHiding;

// ─── MAIN RUNNER EXECUTION SCRIPT ───
public class Task4_DataHiding {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // --- DATA COLLECTION INTAKE ---
        System.out.println("=== Student Data Entry System ===");
        System.out.print("Enter raw student name: ");
        String rawName = inputScanner.nextLine();
        
        // --- OBJECT BIRTH SYNTHESIS ---
        // We instantiate the object. It handles text cleaning and sequential 
        // subject tracking completely on its own inside the constructor!
        Student_dataHiding activeStudent = new Student_dataHiding(rawName, inputScanner);
        
        // --- FINAL REPORT CARD PROFILE GENERATION ---
        System.out.println("\n==================================");
        System.out.println("         ACADEMIC REPORT          ");
        System.out.println("==================================");
        System.out.println("Student Profile: " + activeStudent.getName());
        System.out.println("Total Classes:   " + activeStudent.getGrades().length);
        
        // Call instance method to compute arithmetic output
        double computedAverage = activeStudent.calculateAverage();
        System.out.println("Final Average:   " + computedAverage + "%");
        System.out.println("==================================");
        
        inputScanner.close();
    }
}
