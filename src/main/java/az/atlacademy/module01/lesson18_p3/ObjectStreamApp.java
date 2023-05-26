package az.atlacademy.module01.lesson18_p3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson18_p3/resource/";


    public static void main(String[] args) {
        String studentsFile = RESOURCE + "students.ser";
        Student elvinBachelor = new Student(24, 93, "Elvin");

        try {
            FileOutputStream fos = new FileOutputStream(studentsFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(elvinBachelor);
            oos.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(studentsFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object object = ois.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }
            ois.close();
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }

    }

}
