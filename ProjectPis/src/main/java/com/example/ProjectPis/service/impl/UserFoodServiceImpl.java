package com.example.ProjectPis.service.impl;
import com.example.ProjectPis.Entity.FoodEntity;
import com.example.ProjectPis.Entity.UserEntity;
import com.example.ProjectPis.Entity.UserFoodEntity;
import com.example.ProjectPis.repository.FoodRepo;
import com.example.ProjectPis.repository.UserFoodRepo;
import com.example.ProjectPis.repository.UserRepo;
import com.example.ProjectPis.service.UserFoodService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserFoodServiceImpl implements UserFoodService {

    @Autowired
    UserFoodRepo userFoodRepo;
    @Autowired
    private FoodRepo foodRepo;
    @Autowired
    private UserRepo userRepo;

    @Override
    public String getAll() {
        return null;
    }

    public Iterable<UserFoodEntity> findAll(){
        return userFoodRepo.findAll();
    }

    public String DailyFood(Integer user_id, Integer food_id, UserFoodEntity userFoodEntity) {
        UserEntity userfood = userRepo.findById(user_id).orElseThrow();
        userFoodEntity.setUserEntity(userfood);
        userFoodRepo.save(userFoodEntity);
        return "Food is added successfully";
    }
}
