// Save this entire file as: UnifiedTracker.java
import java.util.Scanner;
// ─── NEW STEP: IMPORT PERMANENT STORAGE FILE TOOLS ───
import java.io.FileWriter;
import java.io.IOException;
import Student_dataHiding.GraduateStudent_inheritance;
import Student_dataHiding.Student_dataHiding;


// ─── CONTINUOUS MAIN RUNNER EXECUTION SCRIPT ───
public class Task7_saveToFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("   WELCOME TO THE GLOBAL STUDENT ENGINE   ");
        System.out.println("==========================================");

        while (true) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Register a Regular Student");
            System.out.println("2. Register a Graduate Student");
            System.out.println("3. Exit Program");
            System.out.print("Enter choice (1-3): ");
            int menuChoice = inputScanner.nextInt();
            inputScanner.nextLine(); // Clear scanner buffer

            if (menuChoice == 3) {
                System.out.println("\nExiting System... Thank you for using Student Engine. Goodbye!");
                break; 
            }

            if (menuChoice != 1 && menuChoice != 2) {
                System.out.println("❌ Invalid option. Please select 1, 2, or 3.");
                continue; 
            }

            System.out.print("\nEnter raw student name: ");
            String rawName = inputScanner.nextLine();

            Student_dataHiding currentStudent = null;

            if (menuChoice == 1) {
                currentStudent = new Student_dataHiding(rawName, inputScanner);
            } else if (menuChoice == 2) {
                System.out.print("Enter Research Thesis Topic: ");
                String thesis = inputScanner.nextLine();
                currentStudent = new GraduateStudent_inheritance(rawName, thesis, inputScanner);
            }

            // --- POLYMORPHIC REPORT COMPILATION ---
            System.out.println("\n==================================================");
            System.out.println("             GENERATING REPORT CARD               ");
            System.out.println("==================================================");
            System.out.println("Account File:    " + currentStudent.getName());
            System.out.println("Tracked Classes: " + currentStudent.getGrades().length);
            
            String extraDetails = "";
            if (currentStudent instanceof GraduateStudent_inheritance) {
                GraduateStudent_inheritance castedGrad = (GraduateStudent_inheritance) currentStudent;
                extraDetails = "Research Focus:  " + castedGrad.getThesisTitle() + "\n";
                System.out.print(extraDetails);
            }

            double averageGrade = currentStudent.calculateAverage();
            System.out.println("Final Grade:     " + averageGrade + "%");
            
            String honorStatus = "Standard Academic Standing";
            if (currentStudent.qualifiesForHonorRoll()) {
                honorStatus = "★ APPROVED FOR HONOR ROLL ★";
            }
            System.out.println("Honor Roll:      " + honorStatus);
            System.out.println("==================================================");

            // ─── NEW STEP: AUTOMATICALLY SAVE DATA TO HARD DRIVE VIA FILE I/O ───
            // Setting the second parameter to 'true' enables APPEND mode so old entries stay saved!
            try (FileWriter fileWriter = new FileWriter("report_cards.txt", true)) {
                
                // Write data patterns onto the disk exactly how we formatted them on screen
                fileWriter.write("=== STUDENT RECORD ===\n");
                fileWriter.write("Name: " + currentStudent.getName() + "\n");
                fileWriter.write("Average: " + averageGrade + "%\n");
                if (!extraDetails.isEmpty()) {
                    fileWriter.write(extraDetails);
                }
                fileWriter.write("Status: " + honorStatus + "\n");
                fileWriter.write("--------------------------------------\n\n");
                
                System.out.println("💾 Backup Status: Report successfully written to 'report_cards.txt'.");
                
            } catch (IOException e) {
                // Intercept data path anomalies (like read-only file lockouts or hardware drops)
                System.out.println("❌ Local Storage Failure: Could not write record backup to disk drive.");
            }
        }
        
        inputScanner.close();
    }
}
