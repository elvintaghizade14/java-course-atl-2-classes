package az.atlacademy.module01.lesson07.encapsulation;

public class RectangleApp {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 4);
        System.out.println(rectangle1.getA());
        System.out.println(rectangle1.getB());
        // rectangle1.a = 0;
        // rectangle1.b = 0;
        // System.out.println(rectangle1.getA());
        // System.out.println(rectangle1.getB());

        Rectangle rectangle2 = new Rectangle(1, 2);
        System.out.println(rectangle2.getA());
        System.out.println(rectangle2.getB());
        rectangle2.setA(5);
        rectangle2.setB(0);
        System.out.println(rectangle2.getA());
        System.out.println(rectangle2.getB());
    }

}
