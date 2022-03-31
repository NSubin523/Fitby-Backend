package com.example.fitby.userInfo.controller;

import com.example.fitby.userInfo.model.UserInfo;
import com.example.fitby.userInfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/userInfo")
public class UserInfoController {

    private final UserInfoService userInfoService;

    @Autowired
    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/{userEmail}")
    public UserInfo getByUserEmail(@PathVariable("userEmail") String userEmail){return userInfoService.getByEmail(userEmail);}

}
