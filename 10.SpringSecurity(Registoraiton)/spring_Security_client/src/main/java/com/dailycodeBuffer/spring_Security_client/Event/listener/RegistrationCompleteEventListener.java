package com.dailycodeBuffer.spring_Security_client.Event.listener;

import com.dailycodeBuffer.spring_Security_client.Entity.User;
import com.dailycodeBuffer.spring_Security_client.Event.RegistrationCompletEvent;
import com.dailycodeBuffer.spring_Security_client.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

@Slf4j
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompletEvent> {

    @Autowired
    private UserService userService;


    @Override
    public void onApplicationEvent(RegistrationCompletEvent event) {
        //Create the Verification token for the user with Link
         User user = event.getUser();
         String token = UUID.randomUUID().toString();
         userService.saveVerficationTokenForuser(token,user);

        //Send Mail to user

        String url = event.getApplicationUrl() + "verifyRegistration?token="+token;


        //sendVerificationEmail() here..
        log.info("Click the link to verify your account: {}",url);
    }
}
