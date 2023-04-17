package az.atlacademy.module01.lesson10;

import java.time.DayOfWeek;
import java.time.Month;

public class SeasonApp {

    public static void main(String[] args) {
        String winter = Season.getWinter();
        System.out.println(winter);

        System.out.println(SeasonEnum.SUMMER);
        System.out.println(SeasonEnum.FALL.name());
        System.out.println(SeasonEnum.FALL.ordinal());
        System.out.println(SeasonEnum.FALL.getAverageTemp());
    }

}
