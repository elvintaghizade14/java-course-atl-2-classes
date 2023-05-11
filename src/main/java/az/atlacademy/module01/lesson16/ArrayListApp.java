package az.atlacademy.module01.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListApp {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.hashCode());
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(nums.size());
    }

}
