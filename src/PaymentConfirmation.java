import java.util.Scanner;

public class PaymentConfirmation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Payment Confirmation ===");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter amount to pay: $");
        double amount = scanner.nextDouble();

        
        System.out.println("\nProcessing payment...");
        System.out.println("Payment of $" + amount + " by " + name + " was successful!");
        
        scanner.close();
    }
}
