package az.atlacademy.module01.lesson22;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalApp {

    public static void main(String[] args) {
        System.out.println(0.6 + 0.6 + 0.6);

        BigInteger bigInteger = new BigInteger("1");
        System.out.println(bigInteger);

        BigInteger added = bigInteger.add(bigInteger).add(bigInteger);
        System.out.println(added);

        BigDecimal bd = new BigDecimal("0.7");
        System.out.println(bd.add(bd).add(bd));
        System.out.println(0.7 + 0.7 + 0.7);
    }

}
