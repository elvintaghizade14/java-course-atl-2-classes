package az.atlacademy.module01.lesson04_p2;

public class ArrayOperations2App {

    public static void main(String[] args) {
        int size = (int) (Math.random() * 10) + 1;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }

        System.out.println("Size is: " + size);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int firstElement = numbers[0];
        int sum = firstElement;
        long prod = firstElement;
        int min = firstElement;
        int max = firstElement;
        for (int i = 1; i < size; i++) {
            int curr = numbers[i];
            sum += curr;
            prod *= curr;
            if (min > curr) {
                min = curr;
            }
            if (max < curr) {
                max = curr;
            }
        }

        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
        System.out.println("Sum  is: " + sum);
        System.out.println("Prod is: " + prod);


    }

}
