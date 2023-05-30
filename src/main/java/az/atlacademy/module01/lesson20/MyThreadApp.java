package az.atlacademy.module01.lesson20;

public class MyThreadApp {

    public static void main(String[] args) {
        new MyThread("E1").run();
        System.out.println();
        new MyThread("E2").run();
    }

}
