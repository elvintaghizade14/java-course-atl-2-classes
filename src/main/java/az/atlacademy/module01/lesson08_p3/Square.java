package az.atlacademy.module01.lesson08_p3;

public class Square extends Shape {

    @Override
    public void print() {
        System.out.println(Square.class.getName());
    }

    public void secret() {
        System.out.println(Square.class.getName() + "'s secret...");
    }

}
