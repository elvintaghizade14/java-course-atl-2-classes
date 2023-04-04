package az.atlacademy.module01.lesson07.encapsulation;

public class Rectangle {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }

    public double getPerimeter() {
        return (a + b) * 2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public void setB(double b) {
        if (b > 0) {
            this.b = b;
        }
    }
}
