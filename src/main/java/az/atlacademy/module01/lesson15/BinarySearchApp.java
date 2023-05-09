package az.atlacademy.module01.lesson15;

import java.util.Arrays;

public class BinarySearchApp {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 10, 40};

        int result1 = binarySearch(0, nums);
        System.out.println(result1);

        int result2 = binarySearch(3, nums);
        System.out.println(result2);

        int result3 = binarySearch(43, nums);
        System.out.println(result3);

        int result4 = binarySearch(5, nums);
        System.out.println(result4);
    }

    public static int binarySearch(int num, int[] nums) {
        return Arrays.binarySearch(nums, num);
    }

}
