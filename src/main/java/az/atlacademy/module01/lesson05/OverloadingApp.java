package az.atlacademy.module01.lesson05;

public class OverloadingApp {

    /*
    1. tipler ferqli olmalidir!
    2. parameter sayi ferqli olmalidir!
    3. parameter sirasi/siyahisi ferqli olmalidir!
     */

    public static void main(String[] args) {
        short s = 12;
        int i = -7;
        double d = 1273.31451;
        System.out.println(multiplyBy2(s));
        System.out.println(multiplyBy2(i));
        System.out.println(multiplyBy2(d));

        System.out.println(Math.max(1, 2));
        System.out.println(Math.max(10.1, 10.2));
    }

    public static short multiplyBy2(short b) {
        return (short) (b * 2);
    }

    public static int multiplyBy2(int b) {
        return (int) (b * 2);
    }

    public static double multiplyBy2(double b) {
        return (double) (b * 2);
    }

    public static short multiplyBy2(int i, int j) {
        return (short) (i * j);
    }

}
