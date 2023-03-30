package az.atlacademy.module01.lesson05;

public class PassingReferencesApp {

    public static void main(String[] args) {
        int[] nums = {14};
        System.out.println(nums[0]);
        foo(nums);
        System.out.println(nums[0]);
    }

    public static void foo(int[] arr) {
        arr[0] = -1;
    }

}
