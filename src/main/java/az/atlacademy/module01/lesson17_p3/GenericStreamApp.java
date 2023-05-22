package az.atlacademy.module01.lesson17_p3;

import java.util.Collection;

public class GenericStreamApp {

    public static void main(String[] args) {

    }

    public static <E> E search(Collection<E> collection, E data) {
        return collection
                .stream()
                .filter(element -> element.equals(data))
                .findFirst()
                .orElseThrow(() -> new DataNotFoundException("Data not found, payload: " + data));
    }

}
