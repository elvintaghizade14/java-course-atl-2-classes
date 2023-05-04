package az.atlacademy.module01.lesson13_p2;

public final class Box<T> {

    private final boolean isEven;
    private final T data;

    public Box(boolean isEven, T data) {
        this.isEven = isEven;
        this.data = data;
    }

    public boolean isEven() {
        return isEven;
    }

    public T getData() {
        return data;
    }

}
