package az.atlacademy.module01.lesson18_p2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FinallyApp {

    public static void main(String[] args) {
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(StudentFileApp.RESOURCE + "nums.ser"));
            for (byte b : bis.readAllBytes()) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(StudentFileApp.RESOURCE + "nums.ser"))) {
            byte[] bytes = bis2.readAllBytes();
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
