package az.atlacademy.module01.lesson17;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {
        IntSummaryStatistics stats = new Random()
                .ints(0, 100)
                .limit(20)
                .summaryStatistics();

        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getSum());

        // for (int i = 0; i < 20; i++) {
        //     System.out.println((int) (Math.random() * 101));
        // }

        Function<Integer, String> function = new Function<>() {
            @Override
            public String apply(Integer num) {
                return num + " " + num;
            }
        };

        String result4 = function.apply(4);
        System.out.println(result4);

        Function<String, Integer> parser = (num) -> Integer.parseInt(num);
        Function<String, Integer> parser2 = Integer::parseInt;

        BiFunction<Integer, Integer, String> concatTimes = (n, m) -> String.valueOf(n * m);

        Consumer<List> listPrinter = list -> System.out.println(list);

        Supplier<Integer> generateRandom = () -> (int) (Math.random() * 101);

        System.out.println(generateRandom.get());
        System.out.println(generateRandom.get());
        System.out.println(generateRandom.get());

        Predicate<Integer> isEven = num -> num % 2 == 0;

        Consumer<Collection<Person>> personConsumer
                = people -> people.forEach(System.out::println);

        Consumer<Collection<Person>> listPerson = new Consumer<Collection<Person>>() {
            @Override
            public void accept(Collection<Person> people) {
                for (Iterator<Person> iterator = people.iterator(); iterator.hasNext(); ) {
                    Person x = iterator.next();
                    System.out.println(x);
                }
            }
        };

        Person elvin = new Person(1, "Elvin");
        Person elvin2 = new Person(1, "Elvin2");
        Predicate<Person> nameLengthPredicate = person -> person.name.length() > 5;
        System.out.println(nameLengthPredicate.test(elvin));
        System.out.println(nameLengthPredicate.test(elvin2));

        BiPredicate<Person, Person> biPredicate
                = (person1, person2) -> person1.name.length() > person2.name.length();
        System.out.println(biPredicate.test(elvin, elvin2));
        System.out.println(biPredicate.test(elvin2, elvin));

        List<Person> people = Arrays.asList(elvin, elvin2);
        people.stream()
                .filter(person -> person.name.length() > 5)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static class Person {
        public int id;
        public String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
