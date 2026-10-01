//4.	Write a Java program to calculate the sum of each column in a matrix. 

import java.util.Scanner;

class ColumnSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum = sum + a[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
}