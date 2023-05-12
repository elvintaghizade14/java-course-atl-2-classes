package az.atlacademy.module01.lesson16_p2;

import java.util.HashMap;

public class MapApp {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(14, "Elvin");
        students.put(2, "Elvin");
        students.put(2, "Elvin");
        students.put(2, "Rasul");
        students.put(3, "Samir");
        System.out.println(students);

        String s = students.get(1);
        System.out.println(s);

        String s2 = students.get(2);
        System.out.println(s2);
        System.out.println(new Integer(2).hashCode());

    }

}
