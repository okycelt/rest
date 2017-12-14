package cz.uhk.kycelon1.rest.controllers;

import cz.uhk.kycelon1.rest.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
        System.out.println("Saving student: " + student.getLastName());
    }

}
