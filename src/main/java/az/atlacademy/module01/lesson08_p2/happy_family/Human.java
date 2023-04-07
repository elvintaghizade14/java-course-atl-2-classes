package az.atlacademy.module01.lesson08_p2.happy_family;

import java.util.Arrays;

public class Human {

    private int iq;
    private int year;
    private String name;
    private String surname;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(int year, String name, String surname) {
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public Human(int year, String name, String surname, Human mother, Human father) {
        this.year = year;
        this.name = name;
        this.surname = surname;
        this.mother = mother;
        this.father = father;
    }

    public Human(int iq, int year, String name, String surname, Pet pet, Human mother, Human father,
                 String[][] schedule) {
        this.iq = iq;
        this.year = year;
        this.name = name;
        this.surname = surname;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }

    public void describePet() {
        System.out.println("I have a" + pet.getSpecies() + ", s/he is " + pet.getAge() +
                " years old, s/he is" + ((pet.getTrickLevel() > 50) ? "very sly" : "almost not sly"));
    }

    @Override
    public String toString() {
        return String.format(
                "Human{iq=%d, year=%d, name='%s', surname='%s', pet=%s, mother=%s, father=%s, schedule=%s}",
                iq, year, name, surname, pet, mother, father, Arrays.toString(schedule));
    }
}
