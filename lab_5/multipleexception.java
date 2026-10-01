// write a program for Multiple Exception Handling

import java.util.Scanner;

class MultipleException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter array index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Value = " + numbers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        finally {
            System.out.println("Exception handling completed");
        }
    }
}