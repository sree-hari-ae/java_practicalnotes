// write a program for Student Management System in Java

import java.util.Scanner;

class Student {

    String name;
    int rollNo;
    double mark;

    // Default constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
        mark = 0;
    }

    // Parameterized constructor
    Student(String name, int rollNo, double mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    // Display student details
    void display() {
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
        System.out.println("Mark = " + mark);
    }

    // Calculate grade for integer mark
    char calculateGrade(int mark) {

        if (mark >= 90)
            return 'A';
        else if (mark >= 75)
            return 'B';
        else if (mark >= 50)
            return 'C';
        else
            return 'F';
    }

    // Calculate grade for double mark
    char calculateGrade(double mark) {

        if (mark >= 90)
            return 'A';
        else if (mark >= 75)
            return 'B';
        else if (mark >= 50)
            return 'C';
        else
            return 'F';
    }
}

class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object using default constructor
        Student s1 = new Student();

        // Input for second student
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter mark: ");
        double mark = sc.nextDouble();

        // Object using parameterized constructor
        Student s2 = new Student(name, rollNo, mark);

        System.out.println("\nStudent 1:");
        s1.display();

        System.out.println("Grade = " + s1.calculateGrade(60));

        System.out.println("\nStudent 2:");
        s2.display();

        System.out.println("Grade = " + s2.calculateGrade(mark));

        // Create another object
        Student s3 = new Student("Arun", 103, 82);

        System.out.println("\nStudent 3:");
        s3.display();

        System.out.println("Grade = " + s3.calculateGrade(82));

        // Make objects eligible for garbage collection
        s1 = null;
        s3 = null;

        System.out.println("\nStudent 1 and Student 3 are eligible for garbage collection.");

        // Request garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}