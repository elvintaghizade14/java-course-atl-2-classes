package az.atlacademy.module01.lesson11;

import java.util.Objects;

public class User {

    private Boolean active;
    private Integer age;
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(active, user.active) && Objects.equals(age, user.age) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, age, name);
    }

    @Override
    public String toString() {
        return String.format("User{active=%s, age=%d, name='%s'}", active, age, name);
    }

}
