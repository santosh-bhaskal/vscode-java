public class SingleInheritancePersonStudent {
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

    static class Student extends Person {
        int rollNumber;
        double marks;

        Student(String name, int age, int rollNumber, double marks) {
            super(name, age);
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        void displayStudent() {
            displayPerson(); // using inherited method
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Marks       : " + marks);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Single Inheritance (Person -> Student) ================");

        System.out.println("=============== Details of Student 1 ===============");
        Student s1 = new Student("Vaishnavi Desai", 20, 201, 91.5);
        s1.displayStudent();

        System.out.println("=============== Details of Student 2 ===============");
        Student s2 = new Student("Harry Potter", 21, 202, 84.0);
        s2.displayStudent();
    }
}
