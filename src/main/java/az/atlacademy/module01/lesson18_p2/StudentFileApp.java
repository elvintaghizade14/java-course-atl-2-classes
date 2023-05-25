package az.atlacademy.module01.lesson18_p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson18_p2/resource/";

    public static void main(String[] args) {
        Student student = new Student(20, 99, "Bob-1");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(RESOURCE + "student.txt"));
            bw.write(student.toString());
            bw.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(RESOURCE + "student.txt"));
            String line = br.readLine();
            System.out.println(line);
            String[] splited = line.split("-");
            Student readStudent = new Student(Integer.parseInt(splited[0]), Double.parseDouble(splited[1]), splited[2]);
            System.out.println(readStudent);
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
