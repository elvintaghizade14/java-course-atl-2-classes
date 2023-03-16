package az.atlacademy.module01.lesson04_p2;

import java.util.stream.IntStream;

public class ForEachLoopApp {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100).forEach(System.out::println);
    }

}
