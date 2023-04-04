package az.atlacademy.module01.lesson07.inheritance;

public class Rectangle {

    private double a;
    private double b;
    private double area;
    private double perimeter;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.area = a * b;
        this.perimeter = 2 * (a + b);
    }

    public void draw() {
        System.out.println("Done!");
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
