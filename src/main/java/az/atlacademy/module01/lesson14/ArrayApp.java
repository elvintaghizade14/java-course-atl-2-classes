package az.atlacademy.module01.lesson14;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        int[] nums = {0, -1, 12, 3, 9};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] words = {"B", "S", "E", "T", "A"};
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }

}
