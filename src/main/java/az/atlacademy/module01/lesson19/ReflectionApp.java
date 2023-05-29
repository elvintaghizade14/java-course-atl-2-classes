package az.atlacademy.module01.lesson19;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionApp {

    public static void main(String[] args) {
        Person person = new Person(1, "Elvin", "Taghizade");
        Field[] fields = person.getClass().getFields();
        System.out.println(Arrays.toString(fields));

        for (Field declaredField : person.getClass().getDeclaredFields()) {
            System.out.println(declaredField);
        }

    }

}
