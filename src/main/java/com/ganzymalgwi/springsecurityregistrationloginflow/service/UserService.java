package com.ganzymalgwi.springsecurityregistrationloginflow.service;

import com.ganzymalgwi.springsecurityregistrationloginflow.entity.User;
import com.ganzymalgwi.springsecurityregistrationloginflow.model.UserModel;

public interface UserService {
     User registerUser(UserModel userModel);

     void saveVerificationTokenForUser(String token, User user);
}
