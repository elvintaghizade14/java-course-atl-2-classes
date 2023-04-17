package az.atlacademy.module01.lesson10;

public final class Season {

    private static final String SPRING = "SPRING";
    private static final String SUMMER = "SUMMER";
    private static final String FALL = "FALL";
    private static final String WINTER = "WINTER";

    private Season() {

    }

    public static String getSpring() {
        return SPRING;
    }

    public static String getSummer() {
        return SUMMER;
    }

    public static String getFall() {
        return FALL;
    }

    public static String getWinter() {
        return WINTER;
    }

}
