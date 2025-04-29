import java.util.*;

class Student {
    int id;
    String name;
    boolean isPresent;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.isPresent = false;
    }
}

public class AttendanceSystem {
    static List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Attendance Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    markAttendance();
                    break;
                case 3:
                    viewAttendance();
                    break;
                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice. Try again.");
            }
        } while (choice != 4);
    }

    static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        students.add(new Student(id, name));
        System.out.println("Student added successfully.");
    }

    static void markAttendance() {
        System.out.println("Mark Attendance (Y/N):");
        for (Student s : students) {
            System.out.print("Is " + s.name + " present? ");
            String input = sc.next();
            s.isPresent = input.equalsIgnoreCase("Y");
        }
        System.out.println("Attendance marked.");
    }

    static void viewAttendance() {
        System.out.println("\n--- Attendance Report ---");
        for (Student s : students) {
            System.out.println("ID: " + s.id + ", Name: " + s.name + ", Present: " + (s.isPresent ? "Yes" : "No"));
        }
    }
}
