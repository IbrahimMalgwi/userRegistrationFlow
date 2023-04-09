package com.ganzymalgwi.springsecurityregistrationloginflow.controller;

import com.ganzymalgwi.springsecurityregistrationloginflow.entity.User;
import com.ganzymalgwi.springsecurityregistrationloginflow.event.RegistrationCompleteEvent;
import com.ganzymalgwi.springsecurityregistrationloginflow.model.UserModel;
import com.ganzymalgwi.springsecurityregistrationloginflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String registerUser(@RequestBody UserModel userModel){
        User user = userService.registerUser(userModel);
        publisher.publishEvent(new RegistrationCompleteEvent(
                user,
                "url"
        ));
        return "Success";
    }

}
