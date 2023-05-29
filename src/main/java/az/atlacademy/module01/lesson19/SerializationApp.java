package az.atlacademy.module01.lesson19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson19/resource/";

    public static void main(String[] args) {
        Person rte = new Person(1, "RTE", "T");

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "people.ser")))) {
            oos.writeObject(rte);
            System.out.println(rte);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(RESOURCE + "people.ser")))) {
            Person rteRead = (Person) ois.readObject();
            System.out.println(rteRead);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



    }

}
