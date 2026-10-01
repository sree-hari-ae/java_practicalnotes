// write a Program to find the smallest element in an array

import java.util.Scanner;

class SmallestArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int smallest = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
    }
}