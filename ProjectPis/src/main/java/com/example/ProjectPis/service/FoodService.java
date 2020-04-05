package com.example.ProjectPis.service;

import com.example.ProjectPis.Entity.FoodEntity;

public interface FoodService {

    Iterable<FoodEntity> findAll();
    String addFood(FoodEntity foodEntity);
    String getFood(FoodEntity foodEntity);
}
