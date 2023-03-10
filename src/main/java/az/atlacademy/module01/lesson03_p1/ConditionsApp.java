package az.atlacademy.module01.lesson03_p1;

import java.util.Scanner;

public class ConditionsApp {

    public static void mainV1(String[] args) {
        // input
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void mainV2(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 0) {
            System.out.println("ZERO");
        } else if (num > 0) {
            System.out.println("P");
        } else {
            System.out.println("N");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num) {
            case 1:
                System.out.println("Yanvar");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Iyun");
                break;
            case 7:
                System.out.println("Iyul");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;
            case 12:
                System.out.println("Dekabr");
            default:
                System.out.println("There is no any month!");
        }
    }

    public static void mainV4(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num <= 0 || num > 12) {
            System.out.println("Invalid input!");
        } else if (num >= 3 && num <= 5) {
            System.out.println("SPRING");
        } else if (num >= 6 && num <= 8) {
            System.out.println("SUMMER");
        } else if (num >= 9 && num <= 11) {
            System.out.println("FALL");
        } else {
            System.out.println("WINTER");
        }
    }

    public static void mainV5(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 1) {
            System.out.println("Yanvar");
        }
    }
}
