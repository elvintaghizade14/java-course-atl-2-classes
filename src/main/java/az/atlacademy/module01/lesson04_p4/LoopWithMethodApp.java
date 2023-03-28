package az.atlacademy.module01.lesson04_p4;

public class LoopWithMethodApp {

    public static void main(String[] args) {
        fillWith(4);
        fillWith(5);
    }

    public static int[] fillWith(int size) {
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 11);
        }
        return nums;
    }

}
