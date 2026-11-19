public class StudentResultInterfaceDemo {
    interface Academic {
        void acceptAcademicMarks(double marks);
    }

    interface Sports {
        void acceptSportsScore(double score);
    }

    static class StudentResult implements Academic, Sports {
        String studentName;
        int rollNo;
        double academicMarks;
        double sportsScore;

        StudentResult(String studentName, int rollNo) {
            this.studentName = studentName;
            this.rollNo = rollNo;
        }

        @Override
        public void acceptAcademicMarks(double marks) {
            this.academicMarks = marks;
        }

        @Override
        public void acceptSportsScore(double score) {
            this.sportsScore = score;
        }

        void calculateAndDisplayResult() {
            double totalScore = academicMarks + sportsScore;
            double percentage = totalScore / 2.0;

            System.out.println("Roll Number          : " + rollNo);
            System.out.println("Student Name         : " + studentName);
            System.out.println("Academic Marks (100) : " + academicMarks);
            System.out.println("Sports Score (100)   : " + sportsScore);
            System.out.println("Total Marks (200)    : " + totalScore);
            System.out.printf("Overall Percentage   : %.2f%%\n", percentage);

            String status = (percentage >= 50.0) ? "PASSED WITH MERIT" : "FAILED";
            System.out.println("Final Result Status  : " + status);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Student Result Management (Multiple Interfaces) ================");

        StudentResult s1 = new StudentResult("Vaishnavi Desai", 101);
        s1.acceptAcademicMarks(88.5);
        s1.acceptSportsScore(94.0);

        System.out.println("=============== Student Performance Card ===============");
        s1.calculateAndDisplayResult();

        StudentResult s2 = new StudentResult("Harry Potter", 102);
        s2.acceptAcademicMarks(76.0);
        s2.acceptSportsScore(82.5);

        System.out.println("=============== Student Performance Card ===============");
        s2.calculateAndDisplayResult();
    }
}
