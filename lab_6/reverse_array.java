//  write a program to reverse an array



import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Reverse array:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}