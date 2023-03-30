package az.atlacademy.module01.lesson05;

import java.util.Scanner;

public class BypassMatrixWithSnakeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row % 2 == 0) {
                    System.out.print(counter++ + "\t");
                } else {
                    System.out.print(--counter + "\t");
                }
            }
            counter += n;
            System.out.println();
        }
    }

}
