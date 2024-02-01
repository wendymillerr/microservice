package com.example.ms.user.services;

import com.example.ms.user.models.UserModel;
import com.example.ms.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel save(UserModel userModel){
        userModel = userRepository.save(userModel);
        return userModel;
    }
}
