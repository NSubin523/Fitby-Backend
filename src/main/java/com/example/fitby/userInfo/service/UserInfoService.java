package com.example.fitby.userInfo.service;

import com.example.fitby.userInfo.model.UserInfo;
import com.example.fitby.userInfo.model.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private final UserInfoRepo userInfoRepo;

    public UserInfoService(UserInfoRepo userInfoRepo) {this.userInfoRepo = userInfoRepo;}

    public UserInfo getByEmail(String userEmail){return userInfoRepo.getByUserEmail(userEmail); }


}
