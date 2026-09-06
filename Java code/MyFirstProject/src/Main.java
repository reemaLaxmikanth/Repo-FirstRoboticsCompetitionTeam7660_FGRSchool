import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the Scanner tool to read inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String customerName = input.nextLine(); // Reads a line of text
        System.out.println("Customer: " + customerName);


        
        System.out.print("How many tickets do you want to buy? ");
        int ticketCount = input.nextInt(); // Reads a whole integer number
        double singleTicketPrice = 12.50;
        
        // Multiply ticket count by the price
        double totalCost = ticketCount * singleTicketPrice;


        
        System.out.println("\n--- Receipt for " + customerName + " ---");
        System.out.println("Tickets bought: " + ticketCount);
        System.out.println("Total Balance due: $" + totalCost);
        input.close();
    }
}

