package az.atlacademy.module01.lesson04_p3;

import java.util.Scanner;

public class Homework01App {

    public static void main(String[] args) {
        final int randomNum = (int) (Math.random() * 1001);
        System.err.println(randomNum);

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        final String name = scanner.nextLine();

        System.out.printf("Let the game begin, %s!\n", name);
        int guessedNum;
        while (true) {
            System.out.print("Your guess: ");
            guessedNum = scanner.nextInt();

            if (guessedNum < randomNum) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guessedNum > randomNum) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s!", name);
                break;
            }
        }
    }

}
