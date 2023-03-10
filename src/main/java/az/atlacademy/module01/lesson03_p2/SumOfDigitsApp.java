package az.atlacademy.module01.lesson03_p2;

import java.util.Scanner;

public class SumOfDigitsApp {

    public static void mainV1(String[] args) {
        int num = new Scanner(System.in).nextInt();

        // num = 1357
        int last = num % 10;            // 7
        int third = (num / 10) % 10;    // 5
        int second = (num / 100) % 10;  // 3
        int first = (num / 1000) % 10;  // 1

        int sumOfDigits = first + second + third + last;
        System.out.println(sumOfDigits);

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int remainder = num % 10;
            num = num / 10;
            sum = sum + remainder;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int sum = 0;
        for (; num > 0; ) {
            int remainder = num % 10;
            num = num / 10;
            sum = sum + remainder;
            System.out.println("Sum is: " + sum);
        }
        System.out.println(sum);
    }

}
