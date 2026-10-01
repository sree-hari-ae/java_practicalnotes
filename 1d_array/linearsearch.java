// write a Program Search an Element in to an Array Using Linear Search 

import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (a[i] == search) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}