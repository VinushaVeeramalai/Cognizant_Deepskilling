package Week_1.JUnit_Testing;

import java.util.Scanner;
import java.util.Scanner;

public class Assertions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== JUnit Assertions Demo ===\n");

        System.out.print("Enter first number  : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("\n--- Assertion Results ---");

        // assertEquals
        System.out.println("assertEquals  : " + a + " + " + b + " = " + (a + b));

        // assertTrue
        boolean isGreater = a > b;
        System.out.println("assertTrue    : " + a + " > " + b + " is " + isGreater);

        // assertFalse
        boolean isLess = a < b;
        System.out.println("assertFalse   : " + a + " < " + b + " is " + isLess);

        // assertNull
        String value = null;
        System.out.println("assertNull    : value is null? " + (value == null));

        // assertNotNull
        String name = "Cognizant";
        System.out.println("assertNotNull : name is not null? " + (name != null));

        System.out.println("\nAll assertions passed!");
        sc.close();
    }
}