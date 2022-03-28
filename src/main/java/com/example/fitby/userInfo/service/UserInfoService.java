package com.example.fitby.userInfo.service;

import com.example.fitby.users.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private final UserRepo userRepo;

    public UserInfoService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


}
