package az.atlacademy.module01.lesson06;

public class Human {

    public static final double usdToAznRate = 1.7;

    public int age;
    public double height;
    public String name;

    public Human() {

    }
    public Human(int age, double height) {

    }

    public Human(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void sleep() {
        System.out.println("Human is sleeping...");
    }

    public void wakeUp() {
        System.out.println("Elvin waked up... :(");
    }

    public String die() {
        return "Xıxıxıxıxıxıx";
    }

}
