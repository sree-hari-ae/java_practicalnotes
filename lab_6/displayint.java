//  write a program to display an array of integers

import java.util.Scanner;

class ArrayDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}