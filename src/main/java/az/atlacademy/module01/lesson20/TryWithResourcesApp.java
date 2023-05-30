package az.atlacademy.module01.lesson20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TryWithResourcesApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson20/resource/";

    public static void main(String[] args) {

        File file = new File(RESOURCE + "people2.ser");
        try (FileOutputStream fis = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(fis);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(new Person(1, "Elqasim", "Ogullari"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
