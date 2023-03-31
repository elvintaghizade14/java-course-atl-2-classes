package az.atlacademy.module01.lesson05_quiz1;

import java.util.Scanner;

public class TaskD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int indexOfMax = 0;
        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            if (max <= curr) {
                max = curr;
                indexOfMax = i;
            }
        }

        System.out.println(max);
        System.out.println(indexOfMax);
    }

}
