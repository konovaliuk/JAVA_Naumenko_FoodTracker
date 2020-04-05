package com.example.ProjectPis.repository;

import com.example.ProjectPis.Entity.FoodEntity;
import com.example.ProjectPis.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Integer> {
    Optional<UserEntity> findById(Integer ID);
    List<UserEntity> findByUsers(String users);
}
