package com.example.fitby.food.controller;

import com.example.fitby.food.model.FoodModel;
import com.example.fitby.food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/food")
public class FoodController {

    private final FoodService service;

    @Autowired
    public FoodController(FoodService service) {
        this.service = service;
    }

    @GetMapping
    public List<FoodModel> getAllFood(){
        return service.getFood();
    }

    @PostMapping
    public void addFood(@RequestBody FoodModel model){
        service.addFood(model);
    }

    @DeleteMapping
    public void clearDB(){
        service.deleteData();
    }
}
