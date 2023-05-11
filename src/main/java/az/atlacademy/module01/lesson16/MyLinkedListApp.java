package az.atlacademy.module01.lesson16;

public class MyLinkedListApp {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(5);
        System.out.println(linkedList.size);
        System.out.println(linkedList);
        linkedList.addTail(6);
        System.out.println(linkedList.size);
        System.out.println(linkedList);
        linkedList.addTail(7);
        System.out.println(linkedList.size);
        System.out.println(linkedList);
        linkedList.addHead(8);
        System.out.println(linkedList.size);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList.size);
        System.out.println(linkedList);
    }

}
