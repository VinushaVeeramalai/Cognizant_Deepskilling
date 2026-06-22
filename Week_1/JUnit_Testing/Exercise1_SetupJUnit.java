package Week_1;

import java.util.Scanner;

class Calculator {
    int add(int a, int b)      { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
}

public class Exercise1_SetupJUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("=== JUnit Setup - Calculator ===\n");

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Addition       : " + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("Subtraction    : " + a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println("Multiplication : " + a + " x " + b + " = " + calc.multiply(a, b));

        sc.close();
    }
}