package com.example.fitby.activityRate.service;

import com.example.fitby.activityRate.model.ActivityRateModel;
import com.example.fitby.activityRate.model.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceActivity {
    @Autowired
    private final Repo repo;

    public ServiceActivity(Repo repo) {
        this.repo = repo;
    }

    public List<ActivityRateModel> getActivities(){
        return repo.findAll();
    }

}
