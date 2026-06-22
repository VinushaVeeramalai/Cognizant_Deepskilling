package Week_1.Mockito_exercises;

import java.util.Scanner;

// Scenario: Test that NotificationService actually sends a message when order is placed
// Verify = confirm that a method was called with correct arguments

// Notification interface
interface NotificationService {
    void sendMessage(String user, String message);
}

// Order service that uses NotificationService
class OrderService {
    private NotificationService notification;

    OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder(String user, String item) {
        System.out.println("Order placed for " + user + " : " + item);
        notification.sendMessage(user, "Your order for " + item + " is confirmed!");
    }
}

// Mock with interaction tracking
class MockNotificationService implements NotificationService {
    String lastUser    = "";
    String lastMessage = "";
    int callCount      = 0;

    public void sendMessage(String user, String message) {
        lastUser    = user;
        lastMessage = message;
        callCount++;
        System.out.println("[MOCK] Message sent to " + user + " : " + message);
    }
}

public class Verifying_Interactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verifying Interactions Demo ===\n");

        MockNotificationService mockNotification = new MockNotificationService();
        OrderService orderService = new OrderService(mockNotification);

        System.out.print("Enter user name : ");
        String user = sc.nextLine();
        System.out.print("Enter item name : ");
        String item = sc.nextLine();

        orderService.placeOrder(user, item);

        // Verify interactions
        System.out.println("\n--- Verification ---");
        System.out.println("sendMessage called? : " + (mockNotification.callCount > 0));
        System.out.println("Called " + mockNotification.callCount + " time(s)");
        System.out.println("Sent to user        : " + mockNotification.lastUser);
        System.out.println("Message             : " + mockNotification.lastMessage);

        sc.close();
    }
}