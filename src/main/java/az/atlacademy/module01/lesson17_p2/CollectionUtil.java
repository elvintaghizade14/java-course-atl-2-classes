package az.atlacademy.module01.lesson17_p2;

import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.function.Function;

public final class CollectionUtil {

    private CollectionUtil() {
        throw new IllegalStateException("Constructor access is prohibited!");
    }

    public static final Function<Collection<Integer>, IntSummaryStatistics> COLLECTION_STATS_FUNC = nums -> {
        final IntSummaryStatistics statistics = new IntSummaryStatistics();
        nums.forEach(statistics::accept);
        return statistics;
    };

    public static final Function<Collection<Integer>, IntSummaryStatistics> COLLECTION_STATS_FUNC_V2 = nums ->
            nums
                    .stream()
                    .mapToInt(Integer::intValue)
                    .summaryStatistics();

}
