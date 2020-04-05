package com.example.ProjectPis.service.impl;

import com.example.ProjectPis.Entity.UserEntity;
import com.example.ProjectPis.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;


@Transactional
@Service
public class UserServiceImpl {

    @Autowired
    private UserRepo userRepo;

    public List<UserEntity> getAllUsers(){
        List<UserEntity> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }

    public String addUser(UserEntity userEntity) {
        userRepo.save(userEntity);
        return "User is created successfully";
    }

}
