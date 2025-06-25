The goal of this project is to build a Java Console-based Student Record Management System that can manage student records. It allows users to add, view, update, and delete student details through a simple text-based menu. Each student has an ID, name, and marks. The system runs in a loop and allows users to perform multiple actions until they choose to exit.

Technologies Used :
* Java – The programming language used to build the application.
* Scanner – Used to take user input from the console.
* ArrayList – Used to store student records dynamically.

**How the Project Works (Step-by-Step)**
Step 1: Program Starts :
The program starts with the main() method. It creates an ArrayList to store student objects and a Scanner object to take input from the user.

Step 2: Display Menu :
A menu is displayed to the user with the following options:
1.Add Student
2.View Students
3.Update Student
4.Delete Student
5.Exit
This menu is shown repeatedly using a while loop until the user selects the Exit option.

Step 3: User Selects Operation :
(The user is prompted to enter a choice from 1 to 5)
Based on the choice:
* The program may ask for student details like ID, name, and marks.
* It performs the appropriate action (add, view, update, delete).
* After completing the operation, the menu is displayed again.

Step 4: Functionality:
* Add Student: Takes input for ID, name, and marks, then creates a Student object and adds it to the list.
* View Students: Displays all student details stored in the list. If the list is empty, it shows a message.
* Update Student: Asks for a student ID. If found, updates the name and marks.
* Delete Student: Asks for a student ID. If found, removes the student from the list.

Step 5: Error Handling :
If the user enters an invalid choice (like 9), it shows:
***Invalid choice. Try again.***

If a student with the entered ID is not found while updating or deleting, it shows a message like:
***Student not found.***

Step 6: Repeat or Exit :
The program continues to show the menu after every operation using a while loop.
If the user selects Option 5 (Exit), it prints:

