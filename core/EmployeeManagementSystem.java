import java.util.Scanner;

public class EmployeeManagementSystem {
    static class Employee {
        int empId;
        String name;
        String designation;
        double salary;

        void accept(Scanner sc) {
            System.out.print("Enter Employee ID: ");
            empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Designation: ");
            designation = sc.nextLine();
            System.out.print("Enter Salary: ");
            salary = sc.nextDouble();
        }

        void display() {
            System.out.println("Employee ID : " + empId);
            System.out.println("Name        : " + name);
            System.out.println("Designation : " + designation);
            System.out.println("Salary      : " + salary);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COUNT = 5;
        Employee[] emp = new Employee[COUNT];

        System.out.println("================ Employee Management System ================");
        System.out.println("Please enter details of 5 employees:");

        for (int i = 0; i < COUNT; i++) {
            System.out.println("\n--------- Enter Details for Employee " + (i + 1) + " ---------");
            emp[i] = new Employee();
            emp[i].accept(sc);
        }

        System.out.println("\n=============== Details of All Employees ===============");
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            emp[i].display();
        }

        sc.close();
    }
}
