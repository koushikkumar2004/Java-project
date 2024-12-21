import java.util.Scanner;

public class StockMarketMonitor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Stock Market Monitor ===");

        
        System.out.print("Enter the stock name: ");
        String stockName = scanner.nextLine();

        System.out.print("Enter the current stock price: ");
        double currentPrice = scanner.nextDouble();

        System.out.print("Set an alert threshold price: ");
        double thresholdPrice = scanner.nextDouble();

       
        if (currentPrice > thresholdPrice) {
            System.out.println("ALERT: The price of " + stockName + " has exceeded the threshold! Current Price: $" + currentPrice);
        } else {
            System.out.println("The price of " + stockName + " is below the threshold. Current Price: $" + currentPrice);
        }

        
        System.out.println("\nEvent Monitoring Completed!");
        scanner.close();
    }
}
