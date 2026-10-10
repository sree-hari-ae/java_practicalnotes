// write a  program to demonstrate reading and writing of primitive data types



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class StudentData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        try {
            // Writing data
            DataOutputStream out =
                new DataOutputStream(
                    new FileOutputStream("student.dat"));

            out.writeInt(roll);
            out.writeUTF(name);
            out.writeDouble(marks);

            out.close();

            // Reading data
            DataInputStream in =
                new DataInputStream(
                    new FileInputStream("student.dat"));

            int r = in.readInt();
            String n = in.readUTF();
            double m = in.readDouble();

            in.close();

            System.out.println("\nStudent Details");
            System.out.println("Roll Number: " + r);
            System.out.println("Name: " + n);
            System.out.println("Marks: " + m);

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}