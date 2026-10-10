//write a prgram to copy a file using buffered streams.




import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile {
    public static void main(String[] args) {

        try {
            BufferedInputStream in =
                new BufferedInputStream(
                    new FileInputStream("source.txt"));

            BufferedOutputStream out =
                new BufferedOutputStream(
                    new FileOutputStream("destination.txt"));

            int ch;

            while ((ch = in.read()) != -1) {
                out.write(ch);
            }

            in.close();
            out.close();

            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println("Error copying file");
        }
    }
}