// write a Program to count even and odd elements in a 3x3 matrix

import java.util.Scanner;

class EvenOddMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        int even = 0;
        int odd = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                a[i][j] = sc.nextInt();

                if (a[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Number of even elements = " + even);
        System.out.println("Number of odd elements = " + odd);
    }
}