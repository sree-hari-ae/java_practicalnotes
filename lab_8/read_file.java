//write a program to read a file and display .



import java.io.FileInputStream;
import java.io.IOException;

class ReadFile {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("input.txt");

            int ch;

            while ((ch = file.read()) != -1) {
                System.out.print((char) ch);
            }

            file.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}