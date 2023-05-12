package az.atlacademy.module01.lesson16;

import java.util.Optional;

public class MyLinkedList<E> {

    public MyNode<E> head;
    public int size = 0;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
        this.size = 1;
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
        this.size++;
    }

    public void addHead(E data) {
        // MyNode<E> newHead = new MyNode<>(data, head);
        // this.head = newHead;
        this.head = new MyNode<>(data, head);
        this.size++;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public Optional<E> findByIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + " is wrong!");
        }
        int counter = 0;
        MyNode<E> curr = head;
        while (curr.next != null) {
            if (index == ++counter) {
                return Optional.of(curr.data);
            }
            curr = curr.next;
        }
        return Optional.empty();
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
