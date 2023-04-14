package az.atlacademy.module01.lesson09;

public class Fish extends Animal implements Swimming {

    @Override
    public void breath() {
        System.out.println("Blo Blo");
    }

    @Override
    public void swim() {
        System.out.println("Bik bik bik");
    }
}
