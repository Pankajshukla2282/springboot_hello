import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World: I am coming!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}