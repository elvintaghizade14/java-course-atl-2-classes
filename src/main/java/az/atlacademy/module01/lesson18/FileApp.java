package az.atlacademy.module01.lesson18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson18/resource/";

    public static void mainV1(String[] args) {
        final String line = new Scanner(System.in).nextLine();
        System.out.println(line);
    }

    public static void mainV2(String[] args) {
        try {
            File aTxt = new File(RESOURCE + "a1.txt");
            FileReader fr = new FileReader(aTxt);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(line);
            fr.close();
            br.close();
            System.out.println("ABC");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            File bTxt = new File(RESOURCE + "b.txt");
            FileWriter fw = new FileWriter(bTxt);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Elvin");
            bw.close();
            fw.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
