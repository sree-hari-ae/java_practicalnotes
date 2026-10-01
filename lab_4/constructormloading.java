// write a program for Constructor Overloading in Java

import java.util.Scanner;

class Box {

    double length;
    double breadth;
    double height;

    // No-argument constructor
    Box() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    // One-dimension constructor
    Box(double side) {
        length = side;
        breadth = side;
        height = side;
    }

    // Three-dimension constructor
    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Volume without parameters
    void volume() {
        System.out.println("Volume = " + (length * breadth * height));
    }

    // Volume with one parameter
    void volume(double side) {
        System.out.println("Volume = " + (side * side * side));
    }

    // Volume with three parameters
    void volume(double length, double breadth, double height) {
        System.out.println("Volume = "
                + (length * breadth * height));
    }
}

class BoxDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box b1 = new Box();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();

        Box b2 = new Box(side);

        System.out.print("Enter length, breadth and height: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        Box b3 = new Box(length, breadth, height);

        System.out.println("\nBox with no dimensions:");
        b1.volume();

        System.out.println("Cube:");
        b2.volume(side);

        System.out.println("Box:");
        b3.volume(length, breadth, height);
    }
}