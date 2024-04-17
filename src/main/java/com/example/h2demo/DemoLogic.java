package com.example.h2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DemoLogic {

    @Autowired
    DemoRepo demoRepo;

    public List<DemoEntity> demoCall() {
        return demoRepo.findByNameContaining("Test");
    }

}
