package com.example.fitby.food.service;

import com.example.fitby.food.model.FoodModel;
import com.example.fitby.food.model.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FoodService {
    @Autowired
    private final FoodRepo repo;


    public FoodService(FoodRepo repo) {
        this.repo = repo;
    }

    public List<FoodModel> getFood(){
        return repo.findAll();
    }

    public void addFood(FoodModel food){
        repo.save(food);
    }

    public void deleteData(){
        repo.deleteAll();
    }
}
