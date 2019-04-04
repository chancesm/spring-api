package hello;

import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayDeque;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private ArrayDeque<Greeting> greetings = new ArrayDeque<Greeting>();

    @RequestMapping("/greeting")
    public ArrayDeque<Greeting> greet(@RequestParam(value="name", defaultValue="World") String name) {
        greetings.add(new Greeting(counter.incrementAndGet(), String.format(template,name)));
        return greetings;
    }
}