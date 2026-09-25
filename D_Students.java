import java.util.Scanner;
public class D_Students {
    Scanner input = new Scanner(System.in);
    D_Students theStudents[] = new D_Students[50];

    public static int count = 0;

    // Method 1 to add books
    public void addStudent(D_Students s)
    {
        for (int i = 0; i < count; i++) {

            if (s.regNum.equalsIgnoreCase(
                    theStudents[i].regNum)) {

                // Print statement
                System.out.println(
                    "Student of Reg Num " + s.regNum
                    + " is Already Registered.");

                return;
            }
        }

        if (count <= 50) {
            theStudents[count] = s;
            count++;
        }
    }

    // Method 2 displaying all students
    public void showAllStudents()
    {
        // Printing student name and corresponding registered number
        System.out.println("Student Name\t\tReg Number");
        for (int i = 0; i < count; i++) {

            System.out.println(theStudents[i].studentName
                               + "\t\t"
                               + theStudents[i].regNum);
        }
    }

    // Method 3 to check the Student
    public int isStudent()
    {
        // Display message only
        System.out.println("Enter Reg Number:");

        String regNum = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (theStudents[i].regNum.equalsIgnoreCase(
                    regNum)) {
                return i;
            }
        }

        // Print statements
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered First.");

        return -1;
    }

    // Method 4 to remove the book
    public void checkOutBook(B_Books book)
    {
        int studentIndex = this.isStudent();

        if (studentIndex != -1) {
            System.out.println("checking out");

            book.showAllBooks();
            B_Book b = book.checkOutBook();

            System.out.println("checking out");
            if (b != null) {

                if (theStudents[studentIndex].booksCount
                    <= 3) {

                    System.out.println("adding book");
                    theStudents[studentIndex].borrowedBooks
                        [theStudents[studentIndex]
                             .booksCount]
                        = b;
                    theStudents[studentIndex].booksCount++;

                    return;
                }
                else {

                    System.out.println(
                        "Student Can not Borrow more than 3 Books.");
                    return;
                }
            }
            System.out.println("Book is not Available.");
        }
    }

    // Method 5 to add the book
    public void checkInBook(B_Books book)
    {
        int studentIndex = this.isStudent();
        if (studentIndex != -1) {

            // Printing credentials corresponding to student
            System.out.println(
                "S.No\t\t\tBook Name\t\t\tAuthor Name");

            student s = theStudents[studentIndex];

            for (int i = 0; i < s.booksCount; i++) {

                System.out.println(
                    s.borrowedBooks[i].sNo + "\t\t\t"
                    + s.borrowedBooks[i].bookName + "\t\t\t"
                    + s.borrowedBooks[i].authorName);
            }

            // Display message only
            System.out.println(
                "Enter Serial Number of Book to be Checked In:");

            int sNo = input.nextInt();

            for (int i = 0; i < s.booksCount; i++) {
                if (sNo == s.borrowedBooks[i].sNo) {
                    book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;

                    return;
                }
            }

            System.out.println("Book of Serial No " + sNo
                               + "not Found");
        }
    }
}
