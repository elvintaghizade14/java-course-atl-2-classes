package az.atlacademy.module01.lesson04_p3.classes;

public class TwoDimensionalArraysApp {

    public static void mainV1(String[] args) {
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * i;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        int counter = 1;
        for (int row = 0; row < nums.length; row++) {
            int[] currRow = nums[0];
            for (int col = 0; col < currRow.length; col++) {
                nums[row][col] = counter++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
