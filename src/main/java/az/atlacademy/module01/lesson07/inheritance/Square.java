package az.atlacademy.module01.lesson07.inheritance;

public class Square {

    private double a;
    private double area;
    private double perimeter;

    public Square(double a) {
        this.a = a;
        this.area = a * a;
        this.perimeter = a * 4;
    }

    public void draw() {
        System.out.println("Done!");
    }

    public double getA() {
        return a;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
