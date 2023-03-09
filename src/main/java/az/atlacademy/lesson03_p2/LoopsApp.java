package az.atlacademy.lesson03_p2;

import java.util.Scanner;

public class LoopsApp {

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println(a);
        System.out.println(a);
        System.out.println("=====");

        if (a % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println(a);
        }
    }

}
