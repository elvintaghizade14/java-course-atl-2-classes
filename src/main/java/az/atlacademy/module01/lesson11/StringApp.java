package az.atlacademy.module01.lesson11;

public class StringApp {

    public static void main(String[] args) {
        String elvin = "Elvin";
        System.out.println(elvin.length());
        String replacedElchin = elvin.replace("v", "ch");
        System.out.println(replacedElchin);
        System.out.println(elvin);

        String elvin2 = new String("Elvin");
        String elvin3 = new String("Elvin");
        System.out.println(elvin2);

        String abc = "Elvin";
        System.out.println(elvin == abc);
        System.out.println(elvin == elvin2);
        System.out.println(elvin.equals(abc));
        System.out.println(elvin.equals(elvin2));

        String elchin = "Elchin";

        System.out.println(elvin.hashCode());
        System.out.println(abc.hashCode());
        System.out.println(elvin2.hashCode());
        System.out.println(elvin3.hashCode());
        System.out.println(elchin.hashCode());
        System.out.println(replacedElchin.hashCode());


    }

}
