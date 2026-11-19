import java.util.Scanner;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {15, 25, 35, 45, 55};

        System.out.println("================ Array Index Handling ================");
        System.out.println("Array of size 5 initialized with elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("------------------------------------------------------");

        try {
            System.out.print("Enter index to retrieve element: ");
            int index = sc.nextInt();

            int val = arr[index];
            System.out.println("\n[Success] Element at index " + index + " is: " + val);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n[Exception Caught] ArrayIndexOutOfBoundsException!");
            System.out.println("Valid index bounds are 0 to " + (arr.length - 1) + ". " + e.getMessage());
        } finally {
            System.out.println("\n[Finally Block] Array access attempt finished.");
            sc.close();
        }

        System.out.println("======================================================");
    }
}
