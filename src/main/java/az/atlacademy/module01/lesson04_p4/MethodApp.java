package az.atlacademy.module01.lesson04_p4;

import java.util.Scanner;

public class MethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isOdd(n));
        printDigit(n);
    }

    public static void printDigit(int n) {
        while (n > 0) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

}
