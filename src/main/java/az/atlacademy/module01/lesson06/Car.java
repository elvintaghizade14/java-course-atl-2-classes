package az.atlacademy.module01.lesson06;

public class Car {
    public static int globalValue = 10;

    public String name;

    public Car(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Gnnnn -> :)" + this.name);
    }

    public static void foo() {
        System.out.println("hello, global!");
    }

    public static void mainV1(String[] args) {
        Car bmwF30 = new Car("F30");
        System.out.println(bmwF30.name);
        bmwF30.start();

        Car bmwF10 = new Car("F10");
        System.out.println(bmwF10.name);
        bmwF10.start();

        bmwF10.foo();
        bmwF30.foo();
        Car.foo();
        System.out.println(bmwF10.globalValue);
        System.out.println(bmwF30.globalValue);
        System.out.println(Car.globalValue);
    }

    public static void main(String[] args) {
        System.out.println(Car.globalValue);
        Car.foo();
        double random = Math.random();
        System.out.println(random);

        Car car011 = new Car("21011");
        car011.foo();
    }

}
