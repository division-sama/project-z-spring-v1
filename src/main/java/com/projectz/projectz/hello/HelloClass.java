package com.projectz.projectz.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class HelloClass {
    
    @RequestMapping("/")
    public String sayHi() {
        return "I love vanshika <3";
    }
}
