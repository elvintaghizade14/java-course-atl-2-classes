package az.atlacademy.module01.lesson12_p2;

import java.util.Scanner;

public class CustomExceptionApp {

    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(age);
    }

    private static void validateAge(int age) throws InvalidAgeException, ArithmeticException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("invalid age!");
        }
    }


}
