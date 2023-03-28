package az.atlacademy.module01.lesson04_p4;

import java.util.Arrays;

public class MemoryManagementApp {

    public static void mainV1(String[] args) {
        int a = 5;
        int b = a;
        a = 6;
        int[] nums = new int[2];
        nums[0] = -9;
        nums[1] = -1;
        int[] c = nums;
        System.out.println(c[0]);
        c[0] = 14;
        System.out.println(nums[0]);
        System.out.println(c[0]);
    }

    public static void main(String[] args) {
        boolean[] nums = new boolean[5];
        System.out.println('\u0000');
        System.out.println(Arrays.toString(nums));

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(numbers));
    }

}
