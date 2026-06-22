package Week_1;
import java.util.Scanner;

class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner   = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
        }
    }

    double getBalance() { return balance; }
    String getOwner()   { return owner; }
}

public class AAA_Pattern {
    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);

        System.out.println("=== AAA Pattern - Bank Account ===\n");

        // --- ARRANGE ---
        System.out.print("Enter account owner name : ");
        String name = sc.next();
        System.out.print("Enter initial balance    : ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, balance);
        System.out.println("\n[ARRANGE] Account created for " + account.getOwner() +
                           " with Rs." + account.getBalance());

        // --- ACT (Deposit) ---
        System.out.print("\nEnter deposit amount : ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("[ACT]     Deposited Rs." + deposit);

        // --- ASSERT ---
        System.out.println("[ASSERT]  New Balance = Rs." + account.getBalance());

        // --- ACT (Withdraw) ---
        System.out.print("\nEnter withdraw amount : ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("[ACT]     Withdrew Rs." + withdraw);

        // --- ASSERT ---
        System.out.println("[ASSERT]  Final Balance = Rs." + account.getBalance());

        System.out.println("\nAAA Pattern test completed successfully!");
        sc.close();
    }
}