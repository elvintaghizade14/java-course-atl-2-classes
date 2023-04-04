package az.atlacademy.module01.lesson07.encapsulation;

public class Student {

    private int age;
    private String name;
    private String[] courses;

    public Student(int age, String name, String[] courses) {
        this.age = age;
        this.name = name;
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String[] getCourses() {
        String[] cloned = new String[this.courses.length];
        for (int i = 0; i < courses.length; i++) {
            cloned[i] = courses[i];
        }
        return cloned;
    }

}
