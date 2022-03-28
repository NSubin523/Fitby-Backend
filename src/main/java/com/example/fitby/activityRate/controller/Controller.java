package com.example.fitby.activityRate.controller;

import com.example.fitby.activityRate.model.ActivityRateModel;
import com.example.fitby.activityRate.service.ServiceActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/activities")
public class Controller {
    @Autowired
    private final ServiceActivity service;

    public Controller(ServiceActivity service) {
        this.service = service;
    }

    @GetMapping
    public List<ActivityRateModel> getActivities(){
        return service.getActivities();
    }
}
