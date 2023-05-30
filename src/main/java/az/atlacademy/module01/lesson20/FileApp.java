package az.atlacademy.module01.lesson20;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson20/resource/";
    public static final Path peopleFilePath = Paths.get(RESOURCE, "people.ser");


    public static void main(String[] args) {
        // todo #1: create object
        final Person elvin = new Person(1, "Elvin", "Taghizade");
        System.out.println(elvin);

        // todo #2: serialize into JSON data format
        final ObjectMapper objectMapper = new ObjectMapper();
        String elvinJson = "";
        try {
            elvinJson = objectMapper.writeValueAsString(elvin);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(elvinJson);

        // todo #3: write into a file
        try {
            Files.writeString(peopleFilePath, elvinJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // todo #4: read from file
        String aPersonJson = "";
        try {
            aPersonJson = Files.readString(peopleFilePath);
            System.out.println(aPersonJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // todo #5: deserialize into object
        try {
            Person person = objectMapper.readValue(aPersonJson, new TypeReference<>() {
            });
            System.out.println(aPersonJson);
            System.out.println(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
