package Week_1.JUnit_Testing;
import java.util.Scanner;

import java.util.Scanner;

// Scenario: Shopping Cart - test add and remove items using AAA pattern

class ShoppingCart {
    int itemCount = 0;

    void addItem()    { itemCount++; }
    void removeItem() { if (itemCount > 0) itemCount--; }
    int getCount()    { return itemCount; }
}

public class AAA_Pattern {

    static ShoppingCart cart; // Test Fixture

    // @Before - Setup - runs before each test
    static void setUp() {
        cart = new ShoppingCart();
        System.out.println("[SETUP]    Fresh cart created");
    }

    // @After - Teardown - runs after each test
    static void tearDown() {
        cart = null;
        System.out.println("[TEARDOWN] Cart cleared\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== AAA Pattern - Shopping Cart ===\n");

        // TEST 1 - Add items
        setUp();                                           // ARRANGE
        System.out.print("Enter number of items to add : ");
        int add = sc.nextInt();
        for (int i = 0; i < add; i++) cart.addItem();     // ACT
        System.out.println("[ASSERT]   Items in cart = " + cart.getCount());
        tearDown();

        // TEST 2 - Remove items
        setUp();                                           
        for (int i = 0; i < 5; i++) cart.addItem();       
        System.out.print("Enter number of items to remove : ");
        int remove = sc.nextInt();
        for (int i = 0; i < remove; i++) cart.removeItem(); // ACT
        System.out.println("[ASSERT]   Items remaining = " + cart.getCount());
        tearDown();

        System.out.println("All tests passed!");
        sc.close();
    }
}