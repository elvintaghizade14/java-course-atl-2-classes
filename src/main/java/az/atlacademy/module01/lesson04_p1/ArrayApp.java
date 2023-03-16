package az.atlacademy.module01.lesson04_p1;

import java.util.Scanner;

public class ArrayApp {

    public static void mainV1(String[] args) {
        double[] grades = new double[8];
        grades[0] = 100.0;
        grades[1] = 100.0;
        grades[2] = 100.0;
        grades[3] = 100.0;
        grades[4] = 222.2;
        grades[5] = 100.0;
        grades[6] = 100.0;
        grades[7] = 100.0;

        System.out.println(grades[4]);
        grades[4] = 222222.2;
        System.out.println(grades[4]);
        System.out.println(grades[6] - 5);
        // System.out.println(grades[-1]);
        // System.out.println(grades[8]);
    }

    public static void mainV2(String[] args) {
        double[] grades1 = new double[] {1, 2, 3};
        double[] grades2 = {11, 22, 33};

        /*for (int i = 0; i <= 3; i++) {
            System.out.print(i + " ");
        }*/

        System.out.println("=====");
        System.out.println(grades1.length);

        for (int i = 0; i < grades2.length; i++) {
            System.out.print(((int) grades2[i]) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            int num = in.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }

}
