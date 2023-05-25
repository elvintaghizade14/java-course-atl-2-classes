package az.atlacademy.module01.lesson18_p2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileStreamApp {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(StudentFileApp.RESOURCE + "nums.ser");
            fos.write("1234567890".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream(StudentFileApp.RESOURCE + "names.ser"));
            bos.write("Elvin Taghizade".getBytes());
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(StudentFileApp.RESOURCE + "names.ser"));
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
