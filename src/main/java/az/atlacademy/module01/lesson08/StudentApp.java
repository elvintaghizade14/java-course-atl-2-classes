package az.atlacademy.module01.lesson08;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentApp {

    public static void main(String[] args) {
        Student samir = new Student(20, 76.5);
        System.out.println(samir.getAge());
        System.out.println(samir.getGrade());

        System.out.println(samir);
        System.out.println(samir.hashCode());
        System.out.println(samir.hashCode());

        samir = null;

        System.out.println(samir);

        int[] nums = {1};
        System.out.println(nums.toString());
        System.out.println(Arrays.toString(nums));

        Student student = new Student(24, 51);
        System.out.println(student);
    }
}
