package az.atlacademy.module01.lesson05_quiz1;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            int curr = nums[i];
            int prev = nums[i - 1];
            int next = nums[i + 1];

            if (curr > prev && curr > next) {
                count++;
                System.out.println(i + ". index with value " + curr);
            }
        }

        System.out.println(count);
    }

}
