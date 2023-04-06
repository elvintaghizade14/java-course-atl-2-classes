package az.atlacademy.module01.lesson08;

public class InheritanceApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);
        // rectangle.draw();

        Square square = new Square(3);
        square.draw();
        // square.print();

        Triangle triangle = new Triangle();
        triangle.draw();

        // Figure figure = new Figure();
        Circle circle = new Circle();
        System.out.println(circle.getHello());
    }

}
