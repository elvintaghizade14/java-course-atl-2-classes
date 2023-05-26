package az.atlacademy.module01.lesson18_p3;

import az.atlacademy.module01.lesson18_p2.Student;
import com.fasterxml.jackson.xml.XmlMapper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson18_p3/resource/";


    public static void main(String[] args) {
        Student elvin = new Student(24, 93, "Elvin");

        try {
            XmlMapper xmlMapper = new XmlMapper();
            String elvinJson = xmlMapper.writeValueAsString(elvin);
            System.out.println(elvinJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String elvinJson = objectMapper.writeValueAsString(elvin);
            System.out.println(elvinJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "students.ser")))) {
            byte[] bytes = new ObjectMapper().writeValueAsBytes(elvin);
            oos.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Integer> randomNums = new Random()
                .ints(10, 0, 100)
                .boxed()
                .collect(Collectors.toList());

        try {
            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream(RESOURCE + "nums.ser"));
            byte[] bytes = new byte[10];
            for (int i = 0; i < randomNums.size(); i++) {
                bytes[i] = randomNums.get(i).byteValue();
            }
            bos.write(bytes);
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(RESOURCE + "nums.ser"));
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
