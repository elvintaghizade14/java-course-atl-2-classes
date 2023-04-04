package az.atlacademy.module01.lesson07.inheritance2;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super(a * b * c, a + b + c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
