package az.atlacademy.module01.lesson11;

import java.math.BigDecimal;

public class WrapperApp {

    public static void main(String[] args) {
        User elvin = new User("Elvin");
        System.out.println(elvin);

        Integer i = new Integer(5); // boxing
        Integer i2 = Integer.valueOf(6);
        System.out.println(i);
        System.out.println(i2);

        Integer a = 5;  // autoboxing
        System.out.println(a);
        a = null;
        System.out.println(a);
        // int b = a;      // unboxing
        // System.out.println(b);
        // b = null;

        int i1 = Integer.parseInt("123");

        Integer num = 500; //autoboxing
        Long aLong = Long.valueOf(num);
        Short aShort = Short.valueOf((short) ((int) num));

        System.out.println(0.2 + 0.2 + 0.2);
        BigDecimal aNum = BigDecimal.valueOf(0.2);
        System.out.println(aNum.add(aNum).add(aNum));

    }

}
