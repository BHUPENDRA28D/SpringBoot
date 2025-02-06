package com.dailycodeBuffer.spring_Security_client.Service;

import com.dailycodeBuffer.spring_Security_client.Entity.User;
import com.dailycodeBuffer.spring_Security_client.Entity.VerificationToken;
import com.dailycodeBuffer.spring_Security_client.Model.UserModel;
import com.dailycodeBuffer.spring_Security_client.Repository.UserRepository;
import com.dailycodeBuffer.spring_Security_client.Repository.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private VerificationTokenRepository verificationTokenRepository;

    @Override
    public User registerUser(UserModel userModel) {
        User user =new User();
        user.setEmail(userModel.getEmail());
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        userRepository.save(user);
        return user;
    }


    @Override
    public void saveVerficationTokenForuser(String token, User user) {
        VerificationToken verificationToken = new VerificationToken(user,token);


        verificationTokenRepository.save(verificationToken);
    }
}
