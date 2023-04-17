package az.atlacademy.module01.lesson10;

public final class Student {

    private final int age;
    private final double[] grades;

    public Student(int age, double[] grades) {
        this.age = age;
        this.grades = grades;
    }

    public int getAge() {
        return age;
    }

    public final double[] getGrades() {
        double[] clonedGrades = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            clonedGrades[i] = grades[i];
        }
        return clonedGrades;
    }

}
