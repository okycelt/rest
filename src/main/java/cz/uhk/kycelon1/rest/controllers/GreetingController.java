package cz.uhk.kycelon1.rest.controllers;

import cz.uhk.kycelon1.rest.model.Greeting;
import cz.uhk.kycelon1.rest.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "mate") String name) {
        return greetingService.createGreeting(name);
    }
}
