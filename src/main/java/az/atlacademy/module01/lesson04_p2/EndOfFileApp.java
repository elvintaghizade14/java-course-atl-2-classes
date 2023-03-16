package az.atlacademy.module01.lesson04_p2;

import java.util.Scanner;

public class EndOfFileApp {

    public static void main(String[] args) {
        Scanner novruz = new Scanner(System.in);

        int i = 0;
        while (novruz.hasNext()) {
            int num = novruz.nextInt();
            System.out.println(i++ + " el. is: " + num);
        }
    }

}
