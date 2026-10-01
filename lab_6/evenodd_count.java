//  write a program to count even and odd numbers in an array


import java.util.Scanner;

class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        int even = 0;
        int odd = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even elements = " + even);
        System.out.println("Odd elements = " + odd);
    }
}