package az.atlacademy.module01.lesson21;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicApp {

    public static int COUNTER = 0;
    public static AtomicInteger  atomicInteger;

    public static void main(String[] args) {
        new Thread(() -> COUNTER++).start(); // 1
        new Thread(() -> COUNTER++).start(); // 2
        new Thread(() -> COUNTER++).start(); // 3
        new Thread(() -> COUNTER++).start(); // 4
        new Thread(() -> COUNTER++).start(); // 5
        System.out.println(COUNTER);
    }

}
