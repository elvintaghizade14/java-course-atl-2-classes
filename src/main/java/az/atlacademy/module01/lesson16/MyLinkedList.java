package az.atlacademy.module01.lesson16;

public class MyLinkedList<E> {

    public MyNode<E> head;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
    }

    public void addTail(E data) {
        if (head == null) {
            head = new MyNode<>(data);
            return;
        }
        MyNode<E> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new MyNode<>(data);
    }

    @Override
    public String toString() {
        String result = "[";
        MyNode<E> curr = head;
        while (curr != null) {
            result = result.concat(curr.toString()).concat(" -> ");
            curr = curr.next;
        }
        return result.concat("null]");
    }

}
