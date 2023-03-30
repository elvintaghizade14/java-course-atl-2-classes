package az.atlacademy.module01.lesson05;

import java.util.Arrays;

public class ReferenceSwapApp {

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(Arrays.toString(nums)); // [1, 2]
        swap(nums);
        System.out.println(Arrays.toString(nums)); // [2, 1]
    }

    public static void swap(int[] nums) {
        int c = nums[0];
        nums[0] = nums[1];
        nums[1] = c;
    }



}
