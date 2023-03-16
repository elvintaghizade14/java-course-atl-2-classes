package az.atlacademy.module01.lesson04_p1;

import java.util.Scanner;

public class RandomNumberApp {

    public static void mainV1(String[] args) {
        double random = Math.random();
        System.out.println(random);
        System.out.println((int) random);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * 101);
            nums[i] = random;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " - ");
        }
    }

}
