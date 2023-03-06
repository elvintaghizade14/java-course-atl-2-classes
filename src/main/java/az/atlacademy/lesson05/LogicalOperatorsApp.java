package az.atlacademy.lesson05;

public class LogicalOperatorsApp {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println(!a);
        System.out.println(!c);

        int i = 20;

        boolean isEven = (i % 2) == 0;
        System.out.println(isEven);

        boolean second = isEven && i > 10;
        System.out.println(second);

        boolean third = isEven || (i % 3 == 0);
        System.out.println(third);

                        // false &&
        boolean fourth = !isEven && (i >= 10);
        System.out.println();
    }

}
