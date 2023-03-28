package az.atlacademy.module01.lesson04_p4;

import java.util.Arrays;

public class MethodsApp {

    public static void mainV1(String[] args) {
        printHelloWorld();
        printHelloWorld();
        printHelloWorld();
        double randomTimes5 = randomTimes5();
        System.out.println(randomTimes5);
        System.out.println(randomTimes5());
        System.out.println(0.2 + 0.2 + 0.2);

        printUpperCase("ElvIn");
        System.out.println(Math.abs(-1));
    }

    public static void printHelloWorld() {
        System.out.println("Hello, World!");
        return;
    }

    public static double randomTimes5() {
        return Math.random() * 5;
    }

    public static void printUpperCase(String line) {
        System.out.println(line.toUpperCase());
    }

    public static int[] fillWith(int size) {
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 11);
        }
        return nums;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        printArray(fillWith(5));
    }

}
