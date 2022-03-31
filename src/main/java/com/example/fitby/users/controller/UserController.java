package com.example.fitby.users.controller;

import com.example.fitby.users.model.Users;
import com.example.fitby.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> getUsers(){
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public Users getSingleUser(@PathVariable("userId") Long userId){
        return userService.getOneUser(userId);
    }

    @PostMapping
    public void addUser(@RequestBody Users user){
        userService.addOneUser(user);
    }

    @DeleteMapping
    public void deleteAllUsers(){
        userService.clearDB();
    }

    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable("userId") Long userId){
        userService.deleteUserById(userId);
    }

    @GetMapping("/{userEmail}")
    public Users getUserByEmail(@PathVariable("userEmail") String userEmail){return userService.getByUserEmail(userEmail);}

}
