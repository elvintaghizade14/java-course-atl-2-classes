package az.atlacademy.module01.lesson05;

import java.util.Scanner;

public class NumberInReverseOrderApp {

    public static void main(String[] args) {
        long num = new Scanner(System.in).nextLong();

        do {
            System.out.print(num % 10);
            num /= 10;
        }
        while (num > 0);

    }

}
