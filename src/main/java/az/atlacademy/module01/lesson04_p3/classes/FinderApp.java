package az.atlacademy.module01.lesson04_p3.classes;

import java.util.Scanner;

public class FinderApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int max1 = a > b ? a : b;
        int max2 = c > d ? c : d;

        int max = max1 > max2 ? max1 : max2;
    }

}
