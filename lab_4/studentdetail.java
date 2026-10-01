// write a Program to display student details using class and object

import java.util.Scanner;

class Student {

    String name;
    int rollNo;
    double mark;

    void display() {
        System.out.println("Student Name = " + name);
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Mark = " + mark);
    }
}

class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s.rollNo = sc.nextInt();

        System.out.print("Enter mark: ");
        s.mark = sc.nextDouble();

        System.out.println("\nStudent Details:");

        s.display();
    }
}