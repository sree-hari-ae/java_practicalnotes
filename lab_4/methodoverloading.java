// write a program for Method Overloading in Java

import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class AdditionOverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter three integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.print("Enter two double values: ");
        double p = sc.nextDouble();
        double q = sc.nextDouble();

        System.out.println("Sum of two integers = " + c.add(a, b));

        System.out.println("Sum of three integers = " + c.add(x, y, z));

        System.out.println("Sum of two double values = " + c.add(p, q));
    }
}