public class BankInterestDemo {
    static class Bank {
        String accountHolder;
        double principal;
        double timeYears;

        static double interestRate = 6.0; // default 6%

        Bank(String accountHolder, double principal, double timeYears) {
            this.accountHolder = accountHolder;
            this.principal = principal;
            this.timeYears = timeYears;
        }

        static void updateInterestRate(double newRate) {
            interestRate = newRate;
            System.out.println("Bank Interest Rate updated to : " + interestRate + "%");
        }

        void calculateSimpleInterest() {
            double si = (principal * interestRate * timeYears) / 100.0;
            System.out.println("Account Holder   : " + accountHolder);
            System.out.println("Principal Amount : Rs. " + principal);
            System.out.println("Time Duration    : " + timeYears + " years");
            System.out.println("Interest Rate    : " + interestRate + "%");
            System.out.println("Simple Interest  : Rs. " + si);
            System.out.println("Total Amount     : Rs. " + (principal + si));
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Bank Interest Calculation ================");
        
        Bank holder1 = new Bank("Vaishnavi Desai", 100000.0, 2.0);
        Bank holder2 = new Bank("Harry Potter", 30000.0, 3.0);

        System.out.println("=============== Initial Interest Calculations ===============");
        System.out.println("Current Interest Rate : " + Bank.interestRate + "% per annum\n");
        holder1.calculateSimpleInterest();
        holder2.calculateSimpleInterest();

        System.out.println("\n---------- After Modifying Interest Rate ----------");
        Bank.updateInterestRate(7.5);
        System.out.println();

        System.out.println("=============== Revised Interest Calculations ===============");
        holder1.calculateSimpleInterest();
        holder2.calculateSimpleInterest();
    }
}
