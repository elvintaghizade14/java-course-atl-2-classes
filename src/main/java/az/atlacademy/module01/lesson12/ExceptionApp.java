package az.atlacademy.module01.lesson12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionApp {

    public static void mainV1(String[] args) {
        String name = "Elvin";
        System.out.println(name.length());
        name = null;
        System.out.println(name.length());

        try {
            FileWriter fw = new FileWriter("src/main/java/az/atlacademy/module01/lesson13/a.txt");
            fw.write("Hello, World!");
            fw.close();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("Exception thrown...");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException thrown...");
        }

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException thrown...");
            // e.printStackTrace();
        }

        int[] nums = new int[] {1};
        System.out.println(nums[0]);

        int aNum = Integer.parseInt("123a");
        System.out.println(aNum);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void mainV2(String[] args) {
        main(new String[] {new String("A")});
    }

    public static void mainV3(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int num = 0;
        try {
            num = Integer.parseInt(word);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("NumberFormatException");
        }

        while (num > 0) {
            System.out.print(num % 10 + " ");
            num /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String word1 = scan.next();

        int num = 0;
        int num1 = 0;
        try {
            num = Integer.parseInt(word);
            num1 = Integer.parseInt(word1);
            System.out.println(num / num1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

}
