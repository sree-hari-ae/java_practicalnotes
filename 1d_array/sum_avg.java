// write a Program to calculate sum and average of elements in a 1D array

import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}