package az.atlacademy.module01.lesson20;

public class ThreadApp {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread());
        System.err.println("ABC1");

        Thread elvinThread = new Thread("Elvin");
        Thread elvinThread2 = new Thread("Elvin2");
        System.out.println(elvinThread);
        System.out.println(elvinThread2);
        System.out.println(elvinThread2.isAlive());
        System.out.println(elvinThread.isAlive());
        System.err.println("ABC");
    }

}
