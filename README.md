Project Structure
----------------------------------
MY mini-project will be split into five Java files and each will handle a specific part of the system.

01. Library.java : This is the main application with the menu and execution flow.

02. Book.java: This file represent individual book detail.

03. Books.java: This file manages the collection of books and related operations.

04. Student.java: This file represents individual student details.

05. Students.java: This file manages student records and book borrowing.

-----------------DETAIL EXPLANATION---------------------------------------------------------------------------
1. Book.java:
This file will hold the detail about each book including their serial number, Book name, Author name, total quantity
and available quantity and the constructor will asks the user to enter these details whenever a new book is added.
------------------------------------------------------------
02. Books.java:
Java Program to Illustrate books class to Do all the Operations related to Books such as add, check-in,
check-out,Valid books,Update books
--------------------------------------------------------------
3. Student.java:
This class represents a student in the library system. Each student has a name, registration number and each student can
borrow upto 3 books at a time which are stored in an array and whenver a new student is added into the system, the program
will asks for detials with the help of a constructor.
-------------------------------------------------------------
4.students.java:
This class will keep track of all the student registered in the library. It adds new students only when the registration number is unique. 
We can see a list of registered students as well, before a student borrow or returned a book this class will always check that this
particular student is registered in the system or not. It also handles the process of student borrowing and returning book.
-------------------------------------------------------------
