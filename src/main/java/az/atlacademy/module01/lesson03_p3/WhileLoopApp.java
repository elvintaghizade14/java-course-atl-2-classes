package az.atlacademy.module01.lesson03_p3;

import java.util.Scanner;

public class WhileLoopApp {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int num2 = num;

        int sum = 0;
        for (; num > 0; ) {
            int remainder = num % 10;
            num = num / 10;
            sum = sum + remainder;
        }
        System.out.println(sum);

        int sum2 = 0;
        while (num2 > 0) {
            int remainder = num2 % 10;
            num2 = num2 / 10;
            sum2 = sum2 + remainder;
        }
        System.out.println(sum2);
    }

}
