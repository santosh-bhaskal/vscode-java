public class StudentCountDemo {
    static class Student {
        int rollNumber;
        String name;

        static int studentCount = 0;

        Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
            studentCount++;
        }

        void display() {
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Name        : " + name);
        }

        static void displayStudentCount() {
            System.out.println("Total Number of Students Created : " + studentCount);
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Demonstration of Static Variable: studentCount ================");
        
        System.out.println("Initial State:");
        Student.displayStudentCount();

        System.out.println("\n---------------- Creating First Student ----------------");
        Student s1 = new Student(1, "Vaishnavi Desai");
        s1.display();
        Student.displayStudentCount();

        System.out.println("\n---------------- Creating Second Student ----------------");
        Student s2 = new Student(2, "Harry Potter");
        s2.display();
        Student.displayStudentCount();

        System.out.println("\n---------------- Creating Third Student ----------------");
        Student s3 = new Student(3, "Rohan Deshmukh");
        s3.display();
        Student.displayStudentCount();

        System.out.println("\n================ Final Summary ================");
        Student.displayStudentCount();
    }
}
