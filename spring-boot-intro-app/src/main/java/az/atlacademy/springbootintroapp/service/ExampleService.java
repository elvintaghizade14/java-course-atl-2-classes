package az.atlacademy.springbootintroapp.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    List<String> examples = Arrays.asList("A", "B", "C");

    public List<String> getExamples() {
        return examples;
    }

    public String getExampleById(int id) {
        if (id < 0 || id > examples.size()) {
            throw new IllegalArgumentException("Id is invalid!");
        }
        return examples.get(id);
    }

}
