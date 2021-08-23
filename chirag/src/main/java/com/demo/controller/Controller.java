package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    DemoService service;

    @GetMapping("/health")
    public String health() {
        return "server is up";
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    // Getting value from application.yaml
    @GetMapping("/get")
    public String add() {
        return service.check();
    }

    @PostMapping("/add")
    public String addUserToDb(@RequestBody User user) {

        if (service.addUser(user))
            return "Done";
        return "Loda";

    }

}
