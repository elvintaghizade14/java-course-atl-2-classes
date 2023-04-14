package az.atlacademy.module01.lesson09;

public class Lion extends Animal implements Runnable {

    @Override
    public void breath() {
        System.out.println("Xrrrrr");
    }

    @Override
    public void run() {
        System.out.println("Lion is running...");
    }

}
