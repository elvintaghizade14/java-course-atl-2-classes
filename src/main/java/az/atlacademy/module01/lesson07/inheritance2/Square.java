package az.atlacademy.module01.lesson07.inheritance2;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        super(side * side, side * 4);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

}
