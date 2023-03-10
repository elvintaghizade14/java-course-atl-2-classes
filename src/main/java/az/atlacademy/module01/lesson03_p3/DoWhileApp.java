package az.atlacademy.module01.lesson03_p3;

import java.util.Scanner;

public class DoWhileApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = num;

        while (true) {
            System.out.println(num);
            if (num > 0) {
                System.out.println(num % 10);
                num /= 10;
            } else {
                break;
            }
        }

        do {
            System.out.println(num2);
            if (num2 > 0) {
                System.out.println(num2 % 10);
                num2 /= 10;
            }
        } while (num2 > 0);

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}
