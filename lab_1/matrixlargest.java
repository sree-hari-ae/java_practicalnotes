import java.util.Scanner;

class LargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int largest = a[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (a[i][j] > largest) {
                    largest = a[i][j];
                }
            }
        }

        System.out.println("Largest element = " + largest);
    }
}