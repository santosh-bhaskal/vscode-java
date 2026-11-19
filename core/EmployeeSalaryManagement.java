public class EmployeeSalaryManagement {
    static class Employee {
        int empId;
        String name;
        double salary;

        static String companyName = "Infosys Technologies Ltd.";

        Employee(int empId, String name, double salary) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }

        static void displayCompanyName() {
            System.out.println("Company Name : " + companyName);
        }

        void displayDetails() {
            System.out.println("Employee ID  : " + empId);
            System.out.println("Name         : " + name);
            System.out.println("Salary       : Rs. " + salary);
            System.out.println("Company      : " + companyName);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Employee Salary Management ================");
        
        Employee.displayCompanyName();
        System.out.println();

        System.out.println("=============== Details of First Employee ===============");
        Employee e1 = new Employee(101, "Vaishnavi Desai", 65000.0);
        e1.displayDetails();

        System.out.println("=============== Details of Second Employee ===============");
        Employee e2 = new Employee(102, "Harry Potter", 72000.0);
        e2.displayDetails();
    }
}
