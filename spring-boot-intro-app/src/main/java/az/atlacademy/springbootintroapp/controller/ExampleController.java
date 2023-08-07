package az.atlacademy.springbootintroapp.controller;

import az.atlacademy.springbootintroapp.service.ExampleService;
import java.time.LocalDateTime;
import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/examples")
public class ExampleController {

    @Value("${author-name}")
    private String authorName;

    private final ExampleService exampleService;

    @GetMapping
    public ResponseEntity<List<String>> getExamples() {
        log.info("author name: " + authorName);
        log.info("GET -> getExamples() -> " + LocalDateTime.now());
        List<String> examples = exampleService.getExamples();
        log.info("Body returned: " + examples);
        log.info("GET <- getExamples() <- " + LocalDateTime.now());
        return ResponseEntity.ok(examples);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getExampleById(@NotBlank @PathVariable Integer id) {
        log.info("GET -> getExampleById() -> " + LocalDateTime.now());
        String exampleById = exampleService.getExampleById(id);
        log.info("Body returned: " + exampleById);
        log.info("GET <- getExampleById() <- " + LocalDateTime.now());
        return ResponseEntity.ok(exampleById);
    }

}
