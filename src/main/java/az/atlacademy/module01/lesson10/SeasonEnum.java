package az.atlacademy.module01.lesson10;

public enum SeasonEnum {

    SPRING(24.5),
    SUMMER(39.5),
    FALL(21.5),
    WINTER(0);

    private final double averageTemp;

    SeasonEnum(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }
}
