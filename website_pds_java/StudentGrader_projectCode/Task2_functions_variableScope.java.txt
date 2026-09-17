// Save this entire file as: Task2_functions.java
import java.util.Scanner;

public class Task2_functions {

    // ─── FUNCTION 1: Now handles the console input, cleans it, and returns a String ───
    public static String formatName(Scanner inputScanner) {
        System.out.print("Enter student name (e.g., '  john doe  '): ");
        String rawName = inputScanner.nextLine();
        
        String cleanName = rawName.trim();
        if (cleanName.isEmpty()) return "";
        return cleanName.substring(0, 1).toUpperCase() + cleanName.substring(1);
    }

    // ─── FUNCTION 2: Now handles the console inputs, parses them, and returns a double ───
    public static double parseAndCalculateInitial(Scanner inputScanner) {
        System.out.print("Enter text grade for Math: ");
        String textGrade1 = inputScanner.next();
        System.out.print("Enter text grade for Science: ");
        String textGrade2 = inputScanner.next();

        int score1 = Integer.parseInt(textGrade1);
        int score2 = Integer.parseInt(textGrade2);
        return (double) (score1 + score2) / 2;
    }

    // ─── FUNCTION 3: Takes the array, calculates, and returns a double ───
    public static double calculateAverage(int[] gradesArray) {
        int sum = 0;
        for (int score : gradesArray) {
            sum += score;
        }
        return (double) sum / gradesArray.length;
    }

    // ─── FUNCTION 4: Handles getting the size, creates, populates, and returns the array ───
    public static int[] fillGradesArray(Scanner inputScanner) {
        System.out.print("How many total classes do you want to track? ");
        int totalClasses = inputScanner.nextInt();
        int sum = 0;
        
        int[] scheduleGrades = new int[totalClasses];
        for (int i = 0; i < scheduleGrades.length; i++) {
            System.out.print("Enter text grade for class #" + (i + 1) + ": ");
            String textGrade = inputScanner.next();
            scheduleGrades[i] = Integer.parseInt(textGrade);
            sum += scheduleGrades[i];
        }
        return scheduleGrades;
    }

    // ─── CLEAN MAIN EXECUTIVE RUNNER ───
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // --- TASK 1 CUMULATIVE REUSE ---
        System.out.println("=== Task 1: String Input & Cleaning ===");
        String formattedName = formatName(inputScanner); // Passed Scanner, returns String
        System.out.println("Saved Name: '" + formattedName + "'");
        
        // --- TASK 2 CUMULATIVE REUSE ---
        System.out.println("\n=== Task 2: Parsing & Casting ===");
        double initialAverage = parseAndCalculateInitial(inputScanner); // Passed Scanner, returns double
        System.out.println("Initial 2-Class Average: " + initialAverage + "%");
        
        // --- TASK 3 CUMULATIVE REUSE (With Loop Replaced) ---
        System.out.println("\n=== Task 3 & 4: Array Size & Loop Function ===");
        int[] scheduleGrades = fillGradesArray(inputScanner); // Passed Scanner, returns int[]
        
        // --- TASK 4 OUTPUT VERIFICATION ---
        System.out.println("\n=== Task 4: Final Calculated Return Values ===");
        double computedAverage = calculateAverage(scheduleGrades); // Computes average
        System.out.println("Clean Function Calculated Average: " + computedAverage + "%");
        
        inputScanner.close();
    }
}
