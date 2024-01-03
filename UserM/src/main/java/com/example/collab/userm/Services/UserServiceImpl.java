package com.example.collab.userm.Services;

import com.example.collab.userm.Entities.UserDtls;
import com.example.collab.userm.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDtls createUser(UserDtls user) {

        return userRepo.save(user);
    }

    @Override
    public boolean checkEmail(String email) {

        return userRepo.existsByEmail(email);
    }

}
