package az.atlacademy.module01.lesson07.inheritance2;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(width * height, 2 * (width + height));
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
