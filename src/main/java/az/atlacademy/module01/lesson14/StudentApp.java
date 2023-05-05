package az.atlacademy.module01.lesson14;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {

    public static void main(String[] args) {
        Student[] students = {
                new Student(4, 98, "Elvin"),
                new Student(3, 52.7, "Samir"),
                new Student(2, 52.7, "Murad"),
                new Student(1, 65, "Murad"),
        };

        // System.out.println(Arrays.toString(students));
        // Arrays.sort(students);
        // System.out.println(Arrays.toString(students));

        System.out.println("---");

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new CustomStudentComparator());
        System.out.println(Arrays.toString(students));

        System.out.println("---");

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.grade != s2.grade) {
                    return -Double.compare(s2.grade, s1.grade);
                } else if(!s1.name.equals(s2.name)) {
                    return s2.name.compareTo(s1.name);
                }
                return s1.compareTo(s2);
            }
        });
        System.out.println(Arrays.toString(students));

        System.out.println("---");

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, (s1, s2) -> {
            if (s1.grade != s2.grade) {
                return Double.compare(s2.grade, s1.grade);
            } else if(!s1.name.equals(s2.name)) {
                return s2.name.compareTo(s1.name);
            }
            return s1.compareTo(s2);
        });
        System.out.println(Arrays.toString(students));
    }

}
