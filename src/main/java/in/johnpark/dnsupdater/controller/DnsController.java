package in.johnpark.dnsupdater.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DnsController {
    @GetMapping("/test")
    public String test() {
        return "API is working!";
    }
}
