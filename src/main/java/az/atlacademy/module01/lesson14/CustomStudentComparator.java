package az.atlacademy.module01.lesson14;

import java.util.Comparator;

public class CustomStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.grade != s2.grade) {
            return Double.compare(s2.grade, s1.grade);
        } else if(!s1.name.equals(s2.name)) {
            return s1.name.compareTo(s2.name);
        }
        return s1.compareTo(s2);
    }

}
