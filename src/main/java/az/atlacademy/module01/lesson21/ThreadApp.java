package az.atlacademy.module01.lesson21;

import java.util.concurrent.Callable;

public class ThreadApp {

    public static void main(String[] args) {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        new MyThread("Elvin").start();
        new MyThread("Samir").start();
        new MyThread("Ilqar").start();

        new Thread(new MyThread2()).start();
        new Thread(new MyThread2()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        }).start();

        new Thread(() -> System.out.println("Thread name: " + Thread.currentThread().getName())).start();

        String result = new MyThread3().call();
        System.out.println(result);
    }

    public static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        }

    }

    public static class MyThread2 implements Runnable {

        @Override
        public void run() {
            foo();
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        }

        void foo() {}

    }

    public static class MyThread3 implements Callable<String> {

        @Override
        public String call() {
            final String threadName = Thread.currentThread().getName();
            System.out.println("Thread name: " + threadName);
            return threadName;
        }

    }

}
