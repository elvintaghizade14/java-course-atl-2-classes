package az.atlacademy.module01.lesson03_p2;

import java.util.Scanner;

public class ForLoopApp {

    public static void main(String[] args) throws InterruptedException {
        int num = new Scanner(System.in).nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("===");
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i > 0 ; i++ ) {
            Thread.sleep(1000);
            System.out.println("Elvin");
        }

    }

}
