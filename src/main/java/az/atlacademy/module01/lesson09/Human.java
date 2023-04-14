package az.atlacademy.module01.lesson09;

public class Human extends Alive implements Runnable, Swimming, Speaking {

    @Override
    public void breath() {
        System.out.println("Human breathing...: O2 -> CO2");
    }

    @Override
    public void run() {
        System.out.println("Ax uf");
    }

    @Override
    public void swim() {
        System.out.println("fşfşfşfş");
    }

    @Override
    public void speak() {
        System.out.println("Hi!");
    }

}
