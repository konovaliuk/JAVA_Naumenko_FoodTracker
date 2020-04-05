package com.example.ProjectPis.repository;

import com.example.ProjectPis.Entity.UserFoodEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserFoodRepo extends CrudRepository<UserFoodEntity, Integer> {
    List<UserFoodEntity> findByDatemeal(String datemeal);
}

