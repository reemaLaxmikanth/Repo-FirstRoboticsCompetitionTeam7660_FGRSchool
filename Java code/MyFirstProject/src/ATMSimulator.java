import java.util.Scanner;

/*
The program will display a menu, accept user input via the console, manage a bank balance using arithmetic operators, 
and run continuously in a loop until the user chooses to exit.
*/
public class ATMSimulator {

    // Global variable to keep track of the user's balance
    static double balance = 1000.00; 

    public static void main(String[] academind) {
        // Create a Scanner object to read input from the console (System.in)
        Scanner inputScanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("=== WELCOME TO THE JAVA CONSOLE ATM ===");

        // Iteration Statement: Keeps the program running until isRunning becomes false
        while (isRunning) {
            displayMenu();
            System.out.print("\nEnter your choice (1-4): ");
            int choice = inputScanner.nextInt();

            // Selection Statement: Route user to the correct function based on input
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    handleDeposit(inputScanner);
                    break;
                case 3:
                    handleWithdraw(inputScanner);
                    break;
                case 4:
                    System.out.println("\nThank you for using our ATM. Goodbye!");
                    isRunning = false; // Changes condition to break the while loop
                    break;
                default:
                    System.out.println("\nInvalid option! Please select a number between 1 and 4.");
            }
        }
        
        inputScanner.close(); // Clean up resource
    }

    // Function 1: Displays the UI menu options
    public static void displayMenu() {
        System.out.println("\n--------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("--------------------");
    }

    // Function 2: Prints the current balance
    public static void checkBalance() {
        // System.out output
        System.out.println("\nYour current balance is: $" + balance);
    }

    // Function 3: Processes money deposits using arithmetic and comparison operators
    public static void handleDeposit(Scanner scanner) {
        System.out.print("\nEnter deposit amount: $");
        double depositAmount = scanner.nextDouble();

        // Comparison operator to prevent invalid/negative inputs
        if (depositAmount > 0) {
            // Assignment & Arithmetic Operator: balance = balance + depositAmount
            balance += depositAmount; 
            System.out.println("Successfully deposited: $" + depositAmount);
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
    }

    // Function 4: Processes money withdrawals with logic checks
    public static void handleWithdraw(Scanner scanner) {
        System.out.print("\nEnter withdrawal amount: $");
        double withdrawAmount = scanner.nextDouble();

        // Logical Operator (&&) used to combine safety checks
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            // Assignment & Arithmetic Operator: balance = balance - withdrawAmount
            balance -= withdrawAmount;
            System.out.println("Successfully withdrew: $" + withdrawAmount);
        } else if (withdrawAmount > balance) {
            System.out.println("Error: Insufficient funds! Your balance is only $" + balance);
        } else {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        }
    }
}
