//  write a program to find sum of first N natural numbers

import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum = " + sum);
    }
}