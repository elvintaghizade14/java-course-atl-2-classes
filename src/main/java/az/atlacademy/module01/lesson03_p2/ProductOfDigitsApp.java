package az.atlacademy.module01.lesson03_p2;

import java.util.Scanner;

public class ProductOfDigitsApp {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int prod = 1;
        for (; num > 0; ) {
            int remainder = num % 10;
            num = num / 10;
            prod = prod * remainder;
            System.out.println("Prod is: " + prod);
        }
        System.out.println(prod);
    }

}
