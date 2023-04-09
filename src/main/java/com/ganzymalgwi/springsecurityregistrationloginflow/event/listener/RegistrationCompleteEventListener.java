package com.ganzymalgwi.springsecurityregistrationloginflow.event.listener;

import com.ganzymalgwi.springsecurityregistrationloginflow.entity.User;
import com.ganzymalgwi.springsecurityregistrationloginflow.event.RegistrationCompleteEvent;
import com.ganzymalgwi.springsecurityregistrationloginflow.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

@Slf4j
public class RegistrationCompleteEventListener implements
        ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // Create the verification Token for the User with Link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token, user);
        // Send Mail to user
        String url = event.getApplicationUrl() + "verifyRegistration?token="
                + token;

        //TODO: Send Verification Email()
        log.info("Click the link to verify your account: {}",
                url);
    }
}
