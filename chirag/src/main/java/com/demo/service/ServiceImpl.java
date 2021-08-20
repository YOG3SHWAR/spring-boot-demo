package com.demo.service;

import java.util.regex.Pattern;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
public class ServiceImpl implements DemoService {

    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    @Autowired
    UserRepository repo;

    User user = new User();

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void demo() {

    }

    @Override
    public boolean addUser(User user) {
        if (!isValid(user.getEmail()))
            return false;

        if (repo.findById(user.getId()).isPresent())
            return false;

        repo.save(user);
        return true;
    }

}
