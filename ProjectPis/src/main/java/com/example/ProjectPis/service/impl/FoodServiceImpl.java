package com.example.ProjectPis.service.impl;

import com.example.ProjectPis.Entity.FoodEntity;
import com.example.ProjectPis.Entity.UserEntity;
import com.example.ProjectPis.repository.FoodRepo;
import com.example.ProjectPis.repository.UserRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
@AllArgsConstructor
@Data
@NoArgsConstructor
public class FoodServiceImpl {

    @Autowired
    private FoodRepo foodRepo;
    @Autowired
    private UserRepo userRepo;

    public Iterable<FoodEntity> findAll(){
        return foodRepo.findAll();
    }

    public String addFood(Integer user_id, FoodEntity foodEntity) {
        UserEntity user= userRepo.findById(user_id).orElseThrow();
        foodEntity.setUserEntity(user);
        foodRepo.save(foodEntity);
        return "Food is added successfully";
    }

    public List<FoodEntity> getAllFood(){
        List<FoodEntity> foods = new ArrayList<>();
        foodRepo.findAll().forEach(foods::add);
        return foods;
    }
}
