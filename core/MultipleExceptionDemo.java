import java.util.Scanner;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {100, 200, 300, 400, 500};

        System.out.println("================ Multiple Exception Handling ================");

        try {
            System.out.println("--------- 1. Division Operation ---------");
            System.out.print("Enter Numerator   : ");
            int a = sc.nextInt();

            System.out.print("Enter Denominator : ");
            int b = sc.nextInt();

            int div = a / b;
            System.out.println("Division Result   : " + a + " / " + b + " = " + div);

            System.out.println("\n--------- 2. Array Element Access ---------");
            System.out.print("Enter Array Index (0 to 4) : ");
            int idx = sc.nextInt();

            int item = numbers[idx];
            System.out.println("Array Element at index " + idx + " : " + item);

        } catch (ArithmeticException e) {
            System.out.println("\n[Catch 1] ArithmeticException Caught : Division by zero is undefined.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n[Catch 2] ArrayIndexOutOfBoundsException Caught : Array index out of range.");
        } catch (Exception e) {
            System.out.println("\n[Catch 3] Generic Exception Caught : " + e.getMessage());
        } finally {
            System.out.println("\n[Finally Block] Multiple exception handling demonstration finished.");
            sc.close();
        }

        System.out.println("=============================================================");
    }
}
