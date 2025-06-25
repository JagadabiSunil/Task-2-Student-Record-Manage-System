import java.util.ArrayList;
import java.util.Scanner;

class Student
    {
        int id;
        String name;
        int marks;

        // Constructor
        Student(int id, String name, int marks)
        {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        // Display method
        void display()
        {
            System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
        }
    }

    class student_Record
    {
        public static void main(String[] args)
        {
            ArrayList<Student> students = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int choice = 0;

            while (choice != 5) {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice)
                {
                    case 1: // Add Student
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        students.add(new Student(id, name, marks));
                        System.out.println("Student added successfully!");
                        break;

                    case 2: // View Students
                        System.out.println("\n--- Student List ---");
                        if (students.isEmpty())
                        {
                            System.out.println("No students available.");
                        }
                        else
                        {
                            for (Student s : students)
                            {
                                s.display();
                            }
                        }
                        break;

                    case 3: // Update Student
                        System.out.print("Enter ID to update: ");
                        int updateId = sc.nextInt();
                        boolean foundUpdate = false;

                        for (Student s : students)
                        {
                            if (s.id == updateId)
                            {
                                sc.nextLine(); // Clear newline
                                System.out.print("Enter new Name: ");
                                s.name = sc.nextLine();
                                System.out.print("Enter new Marks: ");
                                s.marks = sc.nextInt();
                                System.out.println("Student updated!");
                                foundUpdate = true;
                                break;
                            }
                        }

                        if (!foundUpdate)
                        {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 4: // Delete Student
                        System.out.print("Enter ID to delete: ");
                        int deleteId = sc.nextInt();
                        boolean foundDelete = false;

                        for (int i = 0; i < students.size(); i++)
                        {
                            if (students.get(i).id == deleteId)
                            {
                                students.remove(i);
                                System.out.println("Student deleted!");
                                foundDelete = true;
                                break;
                            }
                        }

                        if (!foundDelete)
                        {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 5: // Exit
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

            sc.close();
        }
    }


