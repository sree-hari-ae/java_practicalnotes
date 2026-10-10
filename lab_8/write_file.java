//write a program to write a file and display .



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class WriteFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        try {
            FileOutputStream file =
                new FileOutputStream("output.txt", true);

            file.write(text.getBytes());
            file.write('\n');

            file.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}