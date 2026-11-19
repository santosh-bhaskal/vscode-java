public class LibraryManagement {
    static class Library {
        int bookId;
        String bookName;

        static String libraryName = "Central College Library";

        Library(int bookId, String bookName) {
            this.bookId = bookId;
            this.bookName = bookName;
        }

        static void changeLibraryName(String newName) {
            libraryName = newName;
            System.out.println("Library Name changed to : " + libraryName);
        }

        void displayDetails() {
            System.out.println("Library Name : " + libraryName);
            System.out.println("Book ID      : " + bookId);
            System.out.println("Book Title   : " + bookName);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Library Management System ================");

        Library b1 = new Library(101, "Java: The Complete Reference");
        Library b2 = new Library(102, "Data Structures and Algorithms");
        Library b3 = new Library(103, "Clean Architecture");

        System.out.println("\n=============== Books in Library (Initial) ===============");
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();

        System.out.println("\n---------- Changing Library Name via Static Method ----------");
        Library.changeLibraryName("National Digital Knowledge Center");
        System.out.println();

        System.out.println("=============== Books in Library (Updated) ===============");
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
