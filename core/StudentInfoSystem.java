import java.util.Scanner;

public class StudentInfoSystem {
    static class Student {
        int rollNumber;
        String name;
        String branch;
        double marks;

        void accept(Scanner sc) {
            System.out.print("Enter Roll Number: ");
            rollNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Branch: ");
            branch = sc.nextLine();
            System.out.print("Enter Marks: ");
            marks = sc.nextDouble();
        }

        void display() {
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Name        : " + name);
            System.out.println("Branch      : " + branch);
            System.out.println("Marks       : " + marks);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================ Student Information System ================");
        System.out.print("Enter number of students (N): ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--------- Enter Details of Student " + (i + 1) + " ---------");
            students[i] = new Student();
            students[i].accept(sc);
        }

        System.out.println("\n=============== Displaying All Students ===============");
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Student " + (i + 1) + ":");
            students[i].display();
        }

        sc.close();
    }
}
