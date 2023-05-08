package az.atlacademy.module01.lesson14_p2;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LinearSearchApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] nums = IntStream.range(0, 100).limit(15).toArray();

        System.out.println(Arrays.toString(nums));
        Optional<Integer> result = linearSearch(num, nums);

        System.out.println(result);
    }

    public static Optional<Integer> linearSearch(int num, int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .filter(n -> n == num)
                .findFirst();
    }

}
