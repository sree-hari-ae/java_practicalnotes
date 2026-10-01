//  write a Program to find sum of all elements in 2D array

import java.util.Scanner;

class Array2DSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                a[i][j] = sc.nextInt();

                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum of all elements = " + sum);
    }
}