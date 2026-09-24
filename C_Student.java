import java.util.Scanner;
public class C_Student {
    String studentName;
    String regNum;

    A_Book borrowedBooks[] = new A_Book[3];
    public int booksCount = 0;

    // Creating object of Scanner class take input from user
    Scanner input = new Scanner(System.in);

    // Constructor
    public C_Student()
    {
        // Print statement
        System.out.println("Enter Student Name:");

        // This keywords refers to current instance
        this.studentName = input.nextLine();

        // Print statement
        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}