package az.atlacademy.module01.lesson05;

public class SwapApp {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a); // 1
        System.out.println(b); // 2

        swap(a, b);

        System.out.println(a); // 1 2
        System.out.println(b); // 2 1
    }

    public static void swap(int a, int b) {
        int c = a; // 1
        a = b; // 2
        b = c; // 1
    }

}
