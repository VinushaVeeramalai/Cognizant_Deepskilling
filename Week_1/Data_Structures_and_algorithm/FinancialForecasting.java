package Week_1;

import java.util.Scanner;

public class FinancialForecasting {

    static double forecast(double amount, double rate, int years) {
        if (years == 0) return amount;                        // base case
        return forecast(amount * (1 + rate), rate, years - 1); // grow and recurse
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Financial Forecasting ===\n");

        System.out.print("Enter initial investment (Rs.): ");
        double amount = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g. 10 for 10%): ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        System.out.println("\n--- Forecast Results ---");
        for (int i = 1; i <= years; i++) {
            double value = forecast(amount, rate, i);
            System.out.printf("Year %d : Rs.%.2f%n", i, value);
        }

        double finalValue = forecast(amount, rate, years);
        System.out.printf("\nFinal Value after %d years: Rs.%.2f%n", years, finalValue);

        sc.close();
    }
}