import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class InsufficientBalanceDemo {
    static class BankAccount {
        String accountNumber;
        double balance;

        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void displayAccount() {
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Current Balance: Rs. " + balance);
        }

        void withdraw(double amount) throws InsufficientBalanceException {
            System.out.println("\nRequested Withdrawal Amount : Rs. " + amount);
            if (amount > balance) {
                double shortage = amount - balance;
                throw new InsufficientBalanceException("Transaction Failed! Insufficient balance. Short by Rs. " + shortage);
            } else {
                balance -= amount;
                System.out.println("[Transaction Success] Amount of Rs. " + amount + " withdrawn successfully.");
                System.out.println("Updated Account Balance     : Rs. " + balance);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================ Custom Exception: InsufficientBalanceException ================");
        System.out.println("Account Holder : Vaishnavi Desai");
        BankAccount acc = new BankAccount("SB-78945612", 50000.0);
        acc.displayAccount();

        System.out.print("\nEnter amount to withdraw: Rs. ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("\n[Custom Exception Caught] " + e.getMessage());
        } finally {
            System.out.println("\n[Finally Block] Banking transaction session concluded.");
            sc.close();
        }

        System.out.println("================================================================================");
    }
}
