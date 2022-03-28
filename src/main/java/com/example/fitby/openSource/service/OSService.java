package com.example.fitby.openSource.service;

import com.example.fitby.openSource.model.OSModel;
import com.example.fitby.openSource.model.OSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OSService {
    @Autowired
    private final OSRepo osRepo;

    public OSService(OSRepo osRepo) {
        this.osRepo = osRepo;
    }

    public List<OSModel> getLibraries(){
        return osRepo.findAll();
    }
}
