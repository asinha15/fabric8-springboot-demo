package com.arnab.fabric8springbootdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello Spring Boot in OpenShift!";
    }

}