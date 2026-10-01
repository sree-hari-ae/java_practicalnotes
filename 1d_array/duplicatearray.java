// write a Program to find duplicate elements in an array

import java.util.Scanner;

class DuplicateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}