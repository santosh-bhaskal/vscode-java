import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeExceptionDemo {
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is " + age + " (must be at least 18). Not eligible to vote/register!");
        } else {
            System.out.println("[Eligibility Confirmed] Age is " + age + ". Eligible for voter registration.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================ Custom Exception: InvalidAgeException ================");
        System.out.print("Enter age of the candidate: ");
        int age = sc.nextInt();

        try {
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("\n[Custom Exception Caught] " + e.getMessage());
        } finally {
            System.out.println("\n[Finally Block] Age verification completed.");
            sc.close();
        }

        System.out.println("=======================================================================");
    }
}
