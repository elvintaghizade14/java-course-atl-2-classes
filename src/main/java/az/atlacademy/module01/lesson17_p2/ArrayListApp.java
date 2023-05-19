package az.atlacademy.module01.lesson17_p2;

import java.util.Arrays;
import java.util.List;

public class ArrayListApp {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 12, 13, 4, 5);

        // 1. indexed for-loop
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

        // 2. enhanced for-loop
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("===");
        // 3. stream -> for-Each
        nums
                .stream()
                .map(String::valueOf)
                .filter(s -> s.length() > 1)
                .map(Double::parseDouble)
                .forEach(System.out::println);

        List<String> words = Arrays.asList("Go", "Java", "Hello", "World");

        // task 1
        words.forEach(System.out::println);
        words.stream().forEach(System.out::println);

        // task 2
        words
                .stream()
                .map(String::length)
                .forEach(System.out::println);

        // task 3
        words
                .stream()
                .filter(word -> word.length() > 3)
                .forEach(System.out::println);

        // task 4
        int sum = words
                .stream()
                .filter(word -> word.length() >= 3)
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }

}
