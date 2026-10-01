// write a Program to find the largest and smallest element in a 2D array

import java.util.Scanner;

class LargestSmallest2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int largest = a[0][0];
        int smallest = a[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (a[i][j] > largest) {
                    largest = a[i][j];
                }

                if (a[i][j] < smallest) {
                    smallest = a[i][j];
                }
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}