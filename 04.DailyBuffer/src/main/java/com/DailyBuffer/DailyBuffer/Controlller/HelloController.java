package com.DailyBuffer.DailyBuffer.Controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value(("${welcome.message}"))
    private  String welcomeMessage;
    // value fetched from appliction.properties file and passed here..
    @GetMapping("/hello")
    public  String helloworld(){
        return welcomeMessage;
    }


}
