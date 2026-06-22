package Week_1;

import java.util.Scanner;

public class Assertions {

    static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        return a / b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static String getGrade(int marks) {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Assertions in JUnit ===\n");

        // Division
        System.out.print("Enter dividend : ");
        int a = sc.nextInt();
        System.out.print("Enter divisor  : ");
        int b = sc.nextInt();

        try {
            System.out.println("Result         : " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Exception      : " + e.getMessage());
        }

        // Even or Odd
        System.out.print("\nEnter a number to check even/odd: ");
        int n = sc.nextInt();
        System.out.println("Is Even? : " + isEven(n));

        // Grade
        System.out.print("\nEnter marks to get grade: ");
        int marks = sc.nextInt();
        String grade = getGrade(marks);
        System.out.println("Grade    : " + grade);
        System.out.println("Is null? : " + (grade == null));

        System.out.println("\nAll assertions passed!");
        sc.close();
    }
}
