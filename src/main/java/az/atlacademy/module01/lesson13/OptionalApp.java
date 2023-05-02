package az.atlacademy.module01.lesson13;

import java.util.Optional;

public class OptionalApp {

    public static void mainV1(String[] args) {
        Box<Integer> boxedAge = validateAge(24);
        if (boxedAge.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(boxedAge.getData());
        }
        Optional<Integer> optionalInteger = validateAge2(24);
        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        }
    }

    public static Box<Integer> validateAge(int age) {
        if (age < 0 || age > 150) {
            return new Box(null);
        } else {
            return new Box<>(age * 5);
        }
    }

    public static Optional<Integer> validateAge2(Integer age) {
        if (age < 0 || age > 150) {
            return Optional.empty();
        } else {
            return Optional.of(age * 5);
        }
    }

}
