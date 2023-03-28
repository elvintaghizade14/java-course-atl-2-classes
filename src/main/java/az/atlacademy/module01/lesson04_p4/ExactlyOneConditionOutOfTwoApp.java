package az.atlacademy.module01.lesson04_p4;

import java.util.Scanner;

public class ExactlyOneConditionOutOfTwoApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean check1 = n % 2 == 0;
        boolean check2 = n < 0 && n % 3 == 0;
        System.out.println(check1 != check2 ? "YES" : "NO");
    }

}
