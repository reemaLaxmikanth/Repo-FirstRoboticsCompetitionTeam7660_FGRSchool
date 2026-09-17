
import java.util.Scanner;
import Student_dataHiding.GraduateStudent_inheritance;

// ─── MAIN RUNNER EXECUTIVE SCRIPT ───
public class Task5_inheritance {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("=== Graduate Student Data Entry ===");
        System.out.print("Enter raw student name (e.g., '  mariah carey  '): ");
        String rawName = inputScanner.nextLine();
        
        System.out.print("Enter Research Thesis Topic: ");
        String thesis = inputScanner.nextLine();
        
        // Child Object Birth
        GraduateStudent_inheritance activeGrad = new GraduateStudent_inheritance(
            rawName, thesis, inputScanner);
        
        // --- REPORT GENERATION ---
        System.out.println("\n==================================");
        System.out.println("     GRADUATE ACADEMIC REPORT     ");
        System.out.println("==================================");
        System.out.println("Student Profile: " + activeGrad.getName());
        System.out.println("Total Classes:   " + activeGrad.getGrades().length);
        System.out.println("Research Focus:  " + activeGrad.getThesisTitle());
        
        double avg = activeGrad.calculateAverage();
        System.out.println("Final Average:   " + avg + "%");
        
        // ─── EVALUATING THE OVERRIDDEN METHOD ───
        // Java executes the customized child method logic rules automatically!
        if (activeGrad.qualifiesForHonorRoll()) {
            System.out.println("Honor Roll:      ★ APPROVED (95%+ Target Cleared) ★");
        } else {
            System.out.println("Honor Roll:      Standard Graduate Standing");
        }
        System.out.println("==================================");
        
        inputScanner.close();
    }
}