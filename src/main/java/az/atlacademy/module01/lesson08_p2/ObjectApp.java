package az.atlacademy.module01.lesson08_p2;

public class ObjectApp {

    public static void main(String[] args) {
        System.out.println(1 == 1);

        Person murad = new Person(18, 1_000_000);
        System.out.println(murad);

        Person elvin = new Person(24, -1_000_000);
        System.out.println(elvin.toString());
        System.out.println(Integer.toHexString(elvin.hashCode()));

        System.out.println(elvin == murad);

        Person elvin2 = new Person(24, -1_000_000);
        System.out.println(elvin);
        System.out.println(elvin == elvin2);
        boolean isEqual = elvin.equals(elvin2); // elvin == elvin2
        System.out.println(isEqual);

        System.out.println(murad.hashCode());
        System.out.println(elvin.hashCode());
        System.out.println(elvin2.hashCode());

        int[] ints = {1};
        System.out.println(ints.hashCode());
    }

}
