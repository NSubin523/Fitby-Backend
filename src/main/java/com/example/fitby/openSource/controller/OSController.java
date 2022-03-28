package com.example.fitby.openSource.controller;

import com.example.fitby.openSource.model.OSModel;
import com.example.fitby.openSource.service.OSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/libraries")
public class OSController {
    @Autowired
    private final OSService osService;

    public OSController(OSService osService) {
        this.osService = osService;
    }

    @GetMapping
    public List<OSModel> getLibraries(){
        return osService.getLibraries();
    }
}
