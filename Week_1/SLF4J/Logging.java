package Week_1.SLF4J;

import java.util.Scanner;
import java.util.logging.*;

// Scenario: Bank application that logs errors and warnings
// Using java.util.logging (same concept as SLF4J - no extra jar needed)

public class Logging {

    private static final Logger logger = Logger.getLogger(Logging.class.getName());

    // Simulate bank transaction
    static void processTransaction(String user, double amount) {
        if (amount <= 0) {
            logger.severe("ERROR : Invalid amount " + amount + " for user " + user);
        } else if (amount > 10000) {
            logger.warning("WARNING : Large transaction Rs." + amount + " by " + user);
        } else {
            logger.info("INFO : Transaction of Rs." + amount + " by " + user + " successful");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SLF4J Logging Demo - Bank App ===\n");

        System.out.print("Enter user name   : ");
        String user = sc.nextLine();

        System.out.print("Enter amount (Rs.): ");
        double amount = sc.nextDouble();

        System.out.println();
        processTransaction(user, amount);

        // Show all log levels
        System.out.println("\n--- All Log Levels ---");
        logger.info("INFO    : Application started successfully");
        logger.warning("WARNING : Low account balance detected");
        logger.severe("ERROR   : Database connection failed!");

        sc.close();
    }
}
