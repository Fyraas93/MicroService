package com.example.collab.userm.Services;

import com.example.collab.userm.Entities.UserDtls;

public interface UserService {
    public UserDtls createUser(UserDtls user);

    public boolean checkEmail(String email);
}
