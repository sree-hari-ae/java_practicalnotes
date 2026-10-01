// write a program for Constructor Overloading in Java

import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Constructor for rectangle
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor for square
    Rectangle(double side) {
        length = side;
        breadth = side;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }
}

class RectangleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle r2 = new Rectangle(length, breadth);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        Rectangle r3 = new Rectangle(side);

        System.out.println("\nDefault Rectangle:");
        r1.area();

        System.out.println("Rectangle:");
        r2.area();

        System.out.println("Square:");
        r3.area();
    }
}