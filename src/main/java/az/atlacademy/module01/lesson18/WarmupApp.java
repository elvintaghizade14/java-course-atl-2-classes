package az.atlacademy.module01.lesson18;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WarmupApp {

    public static void main(String[] args) {
        Map<Integer, Long> numbers = new Random()
                .ints(20, 0, 10)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        IntSummaryStatistics stats = numbers
                .keySet()
                .stream()
                .mapToInt(integer -> integer.intValue())
                .summaryStatistics();

        long maxCount = numbers.get(stats.getMax());
        long minCount = numbers.get(stats.getMin());
        System.out.println(numbers);
        System.out.println(maxCount);
        System.out.println(minCount);
        System.out.println(numbers.getClass().getName());
    }

}
