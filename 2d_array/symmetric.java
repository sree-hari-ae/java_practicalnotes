//Write a Java program to check whether a given matrix is a symmetric matrix.

import java.util.Scanner;

class SymmetricMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (a[i][j] != a[j][i]) {

                    symmetric = false;
                    break;
                }
            }

            if (!symmetric) {
                break;
            }
        }

        if (symmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}