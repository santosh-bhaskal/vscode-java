public class SingleInheritanceBankDemo {
    static class BankAccount {
        String accountNumber;
        double balance;

        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void displayAccount() {
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Balance        : Rs. " + balance);
        }
    }

    static class SavingsAccount extends BankAccount {
        double interestRate;

        SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        void calculateAndDisplayInterest(double timeYears) {
            displayAccount();
            System.out.println("Interest Rate  : " + interestRate + "% p.a.");
            double interestEarned = (balance * interestRate * timeYears) / 100.0;
            System.out.println("Time Duration  : " + timeYears + " years");
            System.out.println("Interest Earned: Rs. " + interestEarned);
            System.out.println("Total Balance  : Rs. " + (balance + interestEarned));
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Single Inheritance (BankAccount -> SavingsAccount) ================");

        System.out.println("=============== Account 1 ===============");
        SavingsAccount sa1 = new SavingsAccount("SBIN000123456", 25000.0, 4.0);
        sa1.calculateAndDisplayInterest(2.0);

        System.out.println("=============== Account 2 ===============");
        SavingsAccount sa2 = new SavingsAccount("HDFC000789101", 60000.0, 5.5);
        sa2.calculateAndDisplayInterest(3.0);
    }
}
