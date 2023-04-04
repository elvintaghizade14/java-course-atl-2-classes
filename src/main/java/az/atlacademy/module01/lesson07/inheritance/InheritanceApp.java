package az.atlacademy.module01.lesson07.inheritance;

public class InheritanceApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);
        Square square = new Square(3);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.draw();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        rectangle.draw();
    }

    public static void printRectangle(Rectangle rectangle) {
        rectangle.draw();
    }

    public static void printSquare(Square square) {
        square.draw();
    }

}
