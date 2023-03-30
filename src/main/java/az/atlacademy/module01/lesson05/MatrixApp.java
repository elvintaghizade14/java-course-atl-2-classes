package az.atlacademy.module01.lesson05;

import java.util.Scanner;

public class MatrixApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int counter = 1;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = counter++;
            }
        }

        printArray(matrix);
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
