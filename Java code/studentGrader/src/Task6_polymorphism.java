// Save this entire file as: UnifiedTracker.java
import java.util.Scanner;
import Student_dataHiding.GraduateStudent_inheritance;
import Student_dataHiding.Student_dataHiding;

// ─── CONTINUOUS MAIN RUNNER EXECUTION SCRIPT ───
public class Task6_polymorphism {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("   WELCOME TO THE GLOBAL STUDENT ENGINE   ");
        System.out.println("==========================================");

        // ─── DYNAMIC CONTINUOUS WHILE LOOP ───
        while (true) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Register a Regular Student");
            System.out.println("2. Register a Graduate Student");
            System.out.println("3. Exit Program");
            System.out.print("Enter choice (1-3): ");
            int menuChoice = inputScanner.nextInt();
            inputScanner.nextLine(); // Clear out leftover newline token from scanner buffer

            // ─── DYNAMIC EXIT JUMP CONDITION ───
            if (menuChoice == 3) {
                System.out.println("\nExiting System... Thank you for using Student Engine. Goodbye!");
                break; // Instantly breaks the infinite while loop to end the program safely
            }

            // Route user choices or intercept bad choices
            if (menuChoice != 1 && menuChoice != 2) {
                System.out.println("❌ Invalid option. Please select 1, 2, or 3.");
                continue; // Skips the rest of this iteration and restarts the menu loop
            }

            // GATHER SHARED BASE PROFILE DETAILS
            System.out.print("\nEnter raw student name: ");
            String rawName = inputScanner.nextLine();

            // Declare a generic parent type pointer variable to handle polymorphism seamlessly
            Student_dataHiding currentStudent = null;

            // ─── USER DECIDES THE INSTANTIATION TYPE ───
            if (menuChoice == 1) {
                // Instantiates a regular student profile
                currentStudent = new Student_dataHiding(rawName, inputScanner);
            } else if (menuChoice == 2) {
                System.out.print("Enter Research Thesis Topic: ");
                String thesis = inputScanner.nextLine();
                // Instantiates a specialized graduate student child profile
                currentStudent = new GraduateStudent_inheritance(rawName, thesis, inputScanner);
            }

            // ─── POLYMORPHIC REPORT COMPILATION ───
            System.out.println("\n==================================================");
            System.out.println("             GENERATING REPORT CARD               ");
            System.out.println("==================================================");
            System.out.println("Account File:    " + currentStudent.getName());
            System.out.println("Tracked Classes: " + currentStudent.getGrades().length);
            
            // If the object is a GraduateStudent, show their thesis topic using a safe type cast check
            if (currentStudent instanceof GraduateStudent_inheritance) {
                GraduateStudent_inheritance castedGrad = (GraduateStudent_inheritance) currentStudent;
                System.out.println("Research Focus:  " + castedGrad.getThesisTitle());
            }

            double averageGrade = currentStudent.calculateAverage();
            System.out.println("Final Grade:     " + averageGrade + "%");
            
            // Runtime Magic: Automatically triggers the correct 90% or 95% target rules
            if (currentStudent.qualifiesForHonorRoll()) {
                System.out.println("Honor Roll:      ★ APPROVED ★");
            } else {
                System.out.println("Honor Roll:      Standard Academic Standing");
            }
            System.out.println("==================================================");
        }
        
        inputScanner.close();
    }
}
