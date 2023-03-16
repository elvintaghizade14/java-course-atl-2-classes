package az.atlacademy.module01.lesson04_p2;

import java.util.Scanner;

public class ArrayOperationsApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter length of array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please, enter " + (i + 1) + ". element of array: ");
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();


        int sum = 0;
        long prod = 1;
        for (int i = 0; i < size; i++) {
            int currElement = numbers[i];
            sum += currElement;
            prod *= currElement;
        }
        System.out.println("Sum  is: " + sum);
        System.out.println("Prod is: " + prod);

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < size; i++) {
            int curr = numbers[i];
            if (min > curr) {
                min = curr;
            }
            if (max < curr) {
                max = curr;
            }
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);


    }

}
