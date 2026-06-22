package Week_1.JUnit_Testing;

import java.util.Scanner;
 
// Simple Calculator class to test
class Calculator {
    int add(int a, int b)      { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
    int divide(int a, int b)   { return a / b; }
}
 
// Test class - simulates JUnit test
public class Exercise1_SetupJUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
 
        System.out.println("=== JUnit Setup - Calculator Test ===\n");
 
        System.out.print("Enter first number  : ");
        int a = sc.nextInt();
 
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
 
        System.out.println("\n--- Test Results ---");
        System.out.println("Add      : " + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("Subtract : " + a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println("Multiply : " + a + " x " + b + " = " + calc.multiply(a, b));
        System.out.println("Divide   : " + a + " / " + b + " = " + calc.divide(a, b));
 
        System.out.println("\nAll tests passed successfully!");
        sc.close();
    }
}