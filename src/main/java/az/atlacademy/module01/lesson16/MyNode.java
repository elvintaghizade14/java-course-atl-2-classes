package az.atlacademy.module01.lesson16;

public final class MyNode<E> {

    public E data;
    public MyNode<E> next;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
    }

    public MyNode(E data, MyNode<E> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("{data=%s}", data);
    }

}
