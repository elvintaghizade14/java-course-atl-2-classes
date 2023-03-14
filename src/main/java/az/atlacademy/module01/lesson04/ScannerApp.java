package az.atlacademy.module01.lesson04;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.nextLine();
        String myString = scan.nextLine();
        System.out.println(myString);
        int myInt = scan.nextInt();
    }

}
