package az.atlacademy.module01.lesson13;

import java.time.LocalDate;

public class GenericApp {

    public static void main(String[] args) {
        Integer num = 5;
        String line = "abc";
        LocalDate date = LocalDate.now();
        requireNonNull(num);
        requireNonNull(line);
        requireNonNull(date);

        Integer value = getOrElseThrow(null);
        String name = getOrElseThrow("Elvin");
        num = null;
        line = null;
        date = null;
        // requireNonNull(num);
        // requireNonNull(line);
        // requireNonNull(date);
    }

    public static <T> T getOrElseThrow(T data) {
        if (data == null) {
            throw new NullPointerException("Invalid input");
        }
        return data;
    }

    public static <T> void requireNonNull(T data) {
        if (data == null) {
            throw new NullPointerException("Invalid input");
        }
    }

    /*public static void requireNonNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Invalid input");
        }
    }

    public static void requireNonNull(String line) {
        if (line == null) {
            throw new NullPointerException("Invalid input");
        }
    }

    public static void requireNonNull(Integer num) {
        if (num == null) {
            throw new NullPointerException("Invalid input");
        }
    }

    public static void requireNonNull(LocalDate date) {
        if (date == null) {
            throw new NullPointerException("Invalid input");
        }
    }

    public static void requireNonNull(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("Invalid input");
        }
    }*/

}
