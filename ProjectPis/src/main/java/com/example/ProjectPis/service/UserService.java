package com.example.ProjectPis.service;

import com.example.ProjectPis.Entity.UserEntity;

public interface UserService {
    Iterable<UserEntity> findAll();
    String addUser(UserEntity userEntity);
    String GetUser(UserEntity userEntity);
    String login(UserEntity userEntity);

}
