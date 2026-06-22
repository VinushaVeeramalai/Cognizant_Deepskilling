package Week_1.Data_Structures_and_algorithm;

import java.util.Scanner;

public class FinancialForecasting {

    // Recursive method - calls itself year by year
    static double futureValue(double amount, double rate, int years) {
        if (years == 0) return amount;                         // base case - stop
        return futureValue(amount * (1 + rate), rate, years - 1); // recurse
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Financial Forecasting Tool ===\n");

        System.out.print("Enter initial amount (Rs.)     : ");
        double amount = sc.nextDouble();

        System.out.print("Enter annual growth rate (%)   : ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter number of years          : ");
        int years = sc.nextInt();

        System.out.println("\n--- Forecast Results ---");
        for (int i = 1; i <= years; i++) {
            double value = futureValue(amount, rate, i);
            System.out.printf("Year %d : Rs.%.2f%n", i, value);
        }

        System.out.printf("\nFinal Value after %d years : Rs.%.2f%n",
                           years, futureValue(amount, rate, years));
        System.out.println("\nTime Complexity : O(n) - recurses once per year");

        sc.close();
    }
}