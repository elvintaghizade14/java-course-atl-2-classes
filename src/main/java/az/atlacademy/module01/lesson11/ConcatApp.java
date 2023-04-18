package az.atlacademy.module01.lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatApp {

    public static void mainV1(String[] args) {
        String user1 = "Elvin";
        String user2 = user1;
        System.out.println(user1.hashCode());
        user1 = user1.concat(" Taghizade");
        System.out.println(user1);
        System.out.println(user2);
    }

    public static void main(String[] args) {
        String user1 = "Elvin";
        String user2 = user1;
        String third = user2.concat(user1);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(third);

        System.out.println(user1.getBytes());
        System.out.println(Arrays.toString(user1.getBytes()));

        for (byte aByte : user1.getBytes()) {
            System.out.print((char) aByte + " ");
        }

        String[] names = {"A", "A", "B", new String("ABC")};
    }

}
