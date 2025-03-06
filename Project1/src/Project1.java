// BankAccount class
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositing $" + amount + "...");
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawing $" + amount + "...");
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Main class
public class Project1 {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount("Sharmila", 123, 5000.0);

        // Display account details
        account.displayDetails();

        // Deposit money
        account.deposit(1500.0);

        // Withdraw money
        account.withdraw(2000.0);
    }
}
