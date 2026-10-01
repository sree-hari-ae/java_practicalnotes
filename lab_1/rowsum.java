import java.util.Scanner;

class RowSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
}