package az.atlacademy.module01.lesson18_p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FileApp {
    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson18_p2/resource/";

    public static void main(String[] args) {
        // todo generate 10 random nums
        List<Integer> randomNums = generateRandomNums();
        System.out.println(randomNums);

        // todo write all nums into a file
        write(randomNums);

        // todo read all nums
        List<Integer> nums = readAllNums();
        nums.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }

    private static List<Integer> generateRandomNums() {
        return new Random()
                .ints(10, 0, 100)
                .boxed()
                .collect(Collectors.toList());
    }

    private static void write(List<Integer> nums) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(RESOURCE + "a.txt", StandardCharsets.US_ASCII, true));
            for (int num : nums) {
                bw.write(String.valueOf(num));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> readAllNums() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(RESOURCE + "a.txt"));
            List<Integer> nums = br.lines()
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList());
            br.close();
            return nums;
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }


}
