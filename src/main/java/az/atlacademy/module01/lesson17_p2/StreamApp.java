package az.atlacademy.module01.lesson17_p2;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;

public class StreamApp {

    public static void main(String[] args) {
        IntSummaryStatistics stats = CollectionUtil.COLLECTION_STATS_FUNC.apply(Arrays.asList(1, 2, 3, -1, 0));
        System.out.println(stats);

        IntSummaryStatistics stats2 = CollectionUtil.COLLECTION_STATS_FUNC.apply(Collections.emptyList());
        System.out.println(stats2);

        IntSummaryStatistics stats3 = CollectionUtil.COLLECTION_STATS_FUNC_V2.apply(Arrays.asList(1, 2, 3, -1, 0));
        System.out.println(stats3);

        IntSummaryStatistics stats4 = CollectionUtil.COLLECTION_STATS_FUNC_V2.apply(Collections.emptyList());
        System.out.println(stats4);
    }

}
