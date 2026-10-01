// write a program for Abstract Class in Java

abstract class Vehicle {

    abstract void start();

    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts");
    }
}

class AbstractClass {
    public static void main(String[] args) {

        Car c = new Car();
        c.display();
        c.start();

        Bike b = new Bike();
        b.display();
        b.start();
    }
}