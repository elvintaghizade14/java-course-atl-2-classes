package az.atlacademy.module01.lesson08_p3;

public class ShapeApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();

        call(rectangle);
        call(circle);
        call(square);
        call(new Triangle());

        Dot dot = new Dot();
        // call(dot); // compile-time error, Dot IS-NOT-A Shape

        Shape rectangle2 = new Rectangle(); // Rectangle IS-A Shape
        call((Shape) (rectangle2));

        Square square2 = new Square();
        square2.secret();

        Shape square3 = new Square();
        square3.print();
        System.out.println(square3 instanceof Object);
        System.out.println(square3 instanceof Shape);
        System.out.println(square3 instanceof Square);
        System.out.println(square3 instanceof Triangle);

        String s = "1";
        System.out.println(s instanceof String);
    }

    private static void call(Shape shape) {
        shape.print();
    }

    /*private static void call(Rectangle rectangle) {
        rectangle.print();
    }

    private static void call(Circle circle) {
        circle.print();
    }

    private static void call(Square square) {
        square.print();
    }

    private static void call(Triangle triangle) {
        triangle.print();
    }*/

}
