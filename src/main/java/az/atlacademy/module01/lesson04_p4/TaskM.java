package az.atlacademy.module01.lesson04_p4;

import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        double[] nums = new double[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextDouble();
        }
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 2.5) {
                index = i;
                System.out.printf("%d %.2f", index, nums[i]);
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not Found");
        }
    }
}