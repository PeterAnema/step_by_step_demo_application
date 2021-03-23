package nl.novi.springboot.step_by_step_demo_application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }

}
