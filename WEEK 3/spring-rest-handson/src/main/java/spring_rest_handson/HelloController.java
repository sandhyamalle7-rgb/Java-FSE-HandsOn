package spring_rest_handson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring REST API is working";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}