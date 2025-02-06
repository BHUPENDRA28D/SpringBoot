package com.dailycodeBuffer.spring_Security_client.Controller;

import com.dailycodeBuffer.spring_Security_client.Entity.User;
import com.dailycodeBuffer.spring_Security_client.Event.RegistrationCompletEvent;
import com.dailycodeBuffer.spring_Security_client.Model.UserModel;
import com.dailycodeBuffer.spring_Security_client.Service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;
    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel, final HttpServletRequest request){
        User user = userService.registerUser(userModel);

        publisher.publishEvent(new RegistrationCompletEvent(
                user,applicationUrl(request)
        ));
        return "Succesfully registered !!";

    }

    private String applicationUrl(HttpServletRequest request) {
        return "http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
    }


}
