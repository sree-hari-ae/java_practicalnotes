// write a program for Constructor in Java

import java.util.Scanner;

class Book {

    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
        System.out.println();
    }
}

class BookDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object using default constructor
        Book b1 = new Book();

        // Taking values for parameterized constructor
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        // Object using parameterized constructor
        Book b2 = new Book(title, author, price);

        System.out.println("\nBook 1 - Default Constructor:");
        b1.display();

        System.out.println("Book 2 - Parameterized Constructor:");
        b2.display();
    }
}