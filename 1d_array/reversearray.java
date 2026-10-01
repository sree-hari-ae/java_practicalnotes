//write a Reverse the Elements of an 

import java.util.Scanner;

class ArrayReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Reversed array:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}