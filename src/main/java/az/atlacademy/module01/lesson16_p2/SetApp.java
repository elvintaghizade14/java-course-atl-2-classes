package az.atlacademy.module01.lesson16_p2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class SetApp {

    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(3);
        nums.add(1);
        nums.add(3);
        nums.add(1);
        nums.add(3);
        System.out.println(nums);
        Set<Integer> set = new Random()
                .ints(15, 0, 20)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(set);
    }

}
