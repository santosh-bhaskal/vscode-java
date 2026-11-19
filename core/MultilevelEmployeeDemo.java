public class MultilevelEmployeeDemo {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayPerson() {
            System.out.println("Name        : " + name);
            System.out.println("Age         : " + age + " years");
        }
    }

    static class Employee extends Person {
        int empId;
        double salary;

        Employee(String name, int age, int empId, double salary) {
            super(name, age);
            this.empId = empId;
            this.salary = salary;
        }

        void displayEmployee() {
            displayPerson();
            System.out.println("Employee ID : " + empId);
            System.out.println("Base Salary : Rs. " + salary);
        }
    }

    static class Manager extends Employee {
        String departmentName;
        double bonus;

        Manager(String name, int age, int empId, double salary, String departmentName, double bonus) {
            super(name, age, empId, salary);
            this.departmentName = departmentName;
            this.bonus = bonus;
        }

        void displayManager() {
            displayEmployee();
            System.out.println("Department  : " + departmentName);
            System.out.println("Bonus       : Rs. " + bonus);
            System.out.println("Total Comp. : Rs. " + (salary + bonus));
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Multilevel Inheritance (Person -> Employee -> Manager) ================");

        System.out.println("=============== Manager Details ===============");
        Manager mgr = new Manager("Vaishnavi Desai", 35, 5001, 95000.0, "Engineering & Technology", 25000.0);
        mgr.displayManager();
    }
}
