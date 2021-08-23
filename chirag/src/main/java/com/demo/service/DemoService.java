package com.demo.service;

import com.demo.entity.User;

import org.springframework.stereotype.Component;

@Component
public interface DemoService {
    public int add(int a, int b);

    public void demo();

    public boolean addUser(User user);

    public String check();
}
