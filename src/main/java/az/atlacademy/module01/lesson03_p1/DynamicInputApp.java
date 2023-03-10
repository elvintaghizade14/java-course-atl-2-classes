package az.atlacademy.module01.lesson03_p1;

import java.util.Scanner;

public class DynamicInputApp {

    public static void mainV1(String[] args) {
        // input
        int num = 14;

        // process
        boolean isOdd = num % 2 == 1;

        // output
        System.out.println(isOdd ? "TEK" : "CUT");
    }

    public static void mainV2(String[] args) {
        // input
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // process
        boolean isOdd = num % 2 == 1;

        // output
        System.out.println(isOdd ? "TEK" : "CUT");
    }

    public static void mainV3(String[] args) {
        // input
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        // process
        // output
        System.out.printf("%.5f", num);
    }

    public static void mainV4(String[] args) {
        // input
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }

    public static void mainV5(String[] args) {
        // input
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }

    public static void mainV6(String[] args) {
        // input
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word.trim());
    }

}
