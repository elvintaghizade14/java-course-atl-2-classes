package az.atlacademy.module01.lesson13;

public final class Box<T> {

    private final T data;

    public Box(T data) {
        this.data = data;
    }

    public boolean isEmpty() {
        return data == null;
    }

    public T getData() {
        return data;
    }
}
