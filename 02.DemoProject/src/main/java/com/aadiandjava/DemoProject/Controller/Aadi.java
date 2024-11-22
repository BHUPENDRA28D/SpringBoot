package com.aadiandjava.DemoProject.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aadi {

    @GetMapping("/home")
    public String home(){
        return "EveryOne";
    }
}
