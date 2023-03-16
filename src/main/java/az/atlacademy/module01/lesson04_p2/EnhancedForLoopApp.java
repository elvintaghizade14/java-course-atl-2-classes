package az.atlacademy.module01.lesson04_p2;

import java.util.Scanner;

public class EnhancedForLoopApp {

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

        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
