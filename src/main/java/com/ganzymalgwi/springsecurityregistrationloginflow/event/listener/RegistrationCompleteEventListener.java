package com.ganzymalgwi.springsecurityregistrationloginflow.event.listener;

import com.ganzymalgwi.springsecurityregistrationloginflow.entity.User;
import com.ganzymalgwi.springsecurityregistrationloginflow.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements
        ApplicationListener<RegistrationCompleteEvent> {
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // Create the verification Token for the User with Link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();

        // Send Mail to user
    }
}
