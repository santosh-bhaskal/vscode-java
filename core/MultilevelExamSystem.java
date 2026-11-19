public class MultilevelExamSystem {
    static class Student {
        int rollNumber;
        String name;

        Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
        }

        void displayStudent() {
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Student Name: " + name);
        }
    }

    static class Test extends Student {
        double sub1, sub2, sub3;

        Test(int rollNumber, String name, double sub1, double sub2, double sub3) {
            super(rollNumber, name);
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
        }

        void displayMarks() {
            displayStudent();
            System.out.println("Subject 1   : " + sub1);
            System.out.println("Subject 2   : " + sub2);
            System.out.println("Subject 3   : " + sub3);
        }
    }

    static class Result extends Test {
        Result(int rollNumber, String name, double sub1, double sub2, double sub3) {
            super(rollNumber, name, sub1, sub2, sub3);
        }

        void calculateAndDisplay() {
            displayMarks();
            double total = sub1 + sub2 + sub3;
            double percentage = total / 3.0;

            String grade;
            if (percentage >= 85.0) {
                grade = "A+ (Distinction)";
            } else if (percentage >= 70.0) {
                grade = "A (First Class)";
            } else if (percentage >= 55.0) {
                grade = "B (Second Class)";
            } else if (percentage >= 40.0) {
                grade = "C (Pass Class)";
            } else {
                grade = "F (Fail)";
            }

            System.out.println("Total Marks : " + total + " / 300");
            System.out.printf("Percentage  : %.2f%%\n", percentage);
            System.out.println("Grade       : " + grade);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Multilevel Inheritance (Examination System) ================");

        System.out.println("=============== Result of Student 1 ===============");
        Result r1 = new Result(101, "Vaishnavi Desai", 85.0, 92.0, 78.5);
        r1.calculateAndDisplay();

        System.out.println("=============== Result of Student 2 ===============");
        Result r2 = new Result(102, "Harry Potter", 62.0, 71.5, 59.0);
        r2.calculateAndDisplay();
    }
}
