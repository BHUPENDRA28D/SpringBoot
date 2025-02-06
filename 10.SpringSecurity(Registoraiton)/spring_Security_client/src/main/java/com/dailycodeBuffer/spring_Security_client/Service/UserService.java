package com.dailycodeBuffer.spring_Security_client.Service;

import com.dailycodeBuffer.spring_Security_client.Entity.User;
import com.dailycodeBuffer.spring_Security_client.Model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerficationTokenForuser(String token, User user);
}
