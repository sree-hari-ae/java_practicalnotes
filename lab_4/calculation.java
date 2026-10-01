import java.util.Scanner;

class Area {

    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

class AreaCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Area a = new Area();

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        System.out.print("Enter length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.println("Area of square = " + a.calculateArea(side));

        System.out.println("Area of rectangle = "
                + a.calculateArea(length, breadth));

        System.out.println("Area of circle = "
                + a.calculateArea(radius));
    }
}