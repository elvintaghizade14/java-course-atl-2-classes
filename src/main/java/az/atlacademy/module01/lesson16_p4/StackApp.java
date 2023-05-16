package az.atlacademy.module01.lesson16_p4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

public class StackApp {

    private static final Deque<Operation> stack = new LinkedList<>();

    public static void main(String[] args) {
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
    }

    public static Operation doOperation() {
        stack.add(Operation.getRandomOperation());
        return stack.peek();
    }

    public static Optional<Operation> ctrlZ() {
        if (stack.isEmpty()) {
            return Optional.empty();
        }
        final Operation operationEnum = stack.peek();
        stack.removeLast();
        return Optional.of(operationEnum);
    }

    public enum Operation {

        END,
        UNDO,
        REDO,
        HOME,
        ENTER,
        RENAME,
        DELETE;

        public static Operation getRandomOperation() {
            final int random = (int) (Math.random() * Operation.values().length);
            return Operation.values()[random];
        }

    }

}
