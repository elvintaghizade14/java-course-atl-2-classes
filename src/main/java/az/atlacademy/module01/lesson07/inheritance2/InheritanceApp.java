package az.atlacademy.module01.lesson07.inheritance2;

public class InheritanceApp {

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getSide());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.draw();

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        square.draw();
    }

}
