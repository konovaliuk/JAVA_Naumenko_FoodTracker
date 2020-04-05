package com.example.ProjectPis.repository;

import com.example.ProjectPis.Entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepo extends JpaRepository<FoodEntity, Integer> {
    List<FoodEntity> findByFood(String food);
    Optional<FoodEntity> findById(Integer ID);
    List<FoodEntity> findAll();
}
