// write a Program to read and display the elements of an array

import java.util.Scanner;

class ArrayDisplay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}