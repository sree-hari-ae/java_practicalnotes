//  write a program to find average of N numbers in an array



import java.util.Scanner;

class ArrayAverage {
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

        double average = (double) sum / n;

        System.out.println("Average = " + average);
    }
}