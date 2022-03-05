package com.example.fitby.users.service;

import com.example.fitby.users.model.UserRepo;
import com.example.fitby.users.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<Users> getAll(){
        return userRepo.findAll();
    }

    public Users getOneUser(Long userId){
        return userRepo.getById(userId);
    }

    public void addOneUser(Users user){
        userRepo.save(user);
    }

    public void clearDB(){
        userRepo.deleteAll();
    }

    public void deleteUserById(Long userId){
        if(userRepo.existsById(userId))
            userRepo.deleteById(userId);
    }
}
