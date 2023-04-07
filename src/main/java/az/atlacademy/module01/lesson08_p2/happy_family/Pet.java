package az.atlacademy.module01.lesson08_p2.happy_family;

import java.util.Arrays;

public class Pet {

    private int age;
    private int trickLevel;
    private String species;
    private String nickname;
    private String[] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(int age, int trickLevel, String species, String nickname, String[] habits) {
        this.age = age;
        this.trickLevel = trickLevel;
        this.species = species;
        this.nickname = nickname;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am -" + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return String.format("Pet{age=%d, trickLevel=%d, species='%s', nickname='%s', habits=%s}",
                age, trickLevel, species, nickname, Arrays.toString(habits));
    }
}
