package nl.novi.springboot.step_by_step_demo_application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class NameController {

    private static final List<String> names;
    static {
        names = new ArrayList<>();
        names.add("Albert");
        names.add("Bert");
        names.add("Carmen");
    }

    @GetMapping("/names")
    public ResponseEntity<Object> getNames() {
        return ResponseEntity.ok(names);
    }

}
