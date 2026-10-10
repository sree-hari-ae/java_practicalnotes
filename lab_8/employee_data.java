//write a program to store employee details in a file and read the details from the file.




import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class EmployeeRecord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try {
            // Store employee details
            DataOutputStream out =
                new DataOutputStream(
                    new FileOutputStream("employee.dat"));

            out.writeInt(id);
            out.writeUTF(name);
            out.writeDouble(salary);

            out.close();

            // Read employee details
            DataInputStream in =
                new DataInputStream(
                    new FileInputStream("employee.dat"));

            int empId = in.readInt();
            String empName = in.readUTF();
            double empSalary = in.readDouble();

            in.close();

            System.out.println("\nEmployee Details");
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Salary: " + empSalary);

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}