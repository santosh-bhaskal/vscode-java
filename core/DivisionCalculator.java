import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================ Division Calculator (Exception Handling) ================");

        try {
            System.out.print("Enter Numerator (Integer)   : ");
            int num = sc.nextInt();

            System.out.print("Enter Denominator (Integer) : ");
            int den = sc.nextInt();

            System.out.println("\n---------------- Performing Division ----------------");
            int result = num / den;
            System.out.println("Result : " + num + " / " + den + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("\n[Exception Caught] ArithmeticException : Cannot divide by zero!");
            System.out.println("Details : " + e.getMessage());
        } finally {
            System.out.println("\n[Finally Block] Executed successfully: Division operation terminated.");
            sc.close();
        }

        System.out.println("==========================================================================");
    }
}
