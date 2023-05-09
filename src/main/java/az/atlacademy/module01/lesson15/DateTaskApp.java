package az.atlacademy.module01.lesson15;

public class DateTaskApp {

    public static void mainV1(String[] args) {
        String date = "05-10-2023";
        // 10/05/2023                               // 0    1      2
        String[] splited = date.split("-");// ["05", "10", "2023"]
        String result = splited[1] + "/" + splited[0] + "/" + splited[2];
        System.out.println(result);
    }

    public static void mainV2(String[] args) {
        String name = "Galatasaray";

        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                counter++;
            }
        }

        System.out.println(counter);
    }

    public static void mainV3(String[] args) {
        int num = 34;

        int sum = 0;
        int counter = 0;
        long prod = 1;
        for (int i = 1; i < 34; i++) {
            if (i % 2 == 1) {
                sum += i;
                counter++;
                prod *= i;
            }
        }

        System.out.println(sum);
        System.out.println(counter);
        System.out.println(prod);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for(int n: nums) {
            System.out.print(n + " ");
        }

    }

}
