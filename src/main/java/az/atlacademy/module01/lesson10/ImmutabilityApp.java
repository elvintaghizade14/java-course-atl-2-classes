package az.atlacademy.module01.lesson10;

import java.util.Arrays;

public class ImmutabilityApp {

    public static void mainV1(String[] args) {
        final int a = 5;
        final int[] nums = new int[] {-3, -4};
        // nums = null;
        System.out.println(Arrays.toString(nums));
        nums[0] = 2;
        nums[1] = 12;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Student student = new Student(24, new double[] {78, 91});
        int age = student.getAge();
        System.out.println(age);
        age = 100;
        System.out.println(age);
        System.out.println(student.getAge());

        System.out.println("---");

        double[] grades = student.getGrades();
        System.out.println(grades[0]);
        System.out.println(student.getGrades()[0]);
        grades[0] = -20;
        System.out.println(grades[0]);
        System.out.println(student.getGrades()[0]);
    }

}
