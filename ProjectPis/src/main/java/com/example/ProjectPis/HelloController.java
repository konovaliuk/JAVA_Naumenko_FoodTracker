package com.example.ProjectPis;

import com.example.ProjectPis.Entity.FoodEntity;
import com.example.ProjectPis.Entity.UserEntity;
import com.example.ProjectPis.service.impl.FoodServiceImpl;
import com.example.ProjectPis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@RestController

public class HelloController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private FoodServiceImpl foodService;

    @RequestMapping(value = "/getUsers")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/getFood")
    public List<FoodEntity> getAllFood() {
        return foodService.getAllFood();
    }

    @RequestMapping(value = "/addFood", method = RequestMethod.POST)
    String addFood(@RequestParam(name = "user_id", required = true) Integer user_id, @RequestBody FoodEntity foodEntity) {
        return foodService.addFood(user_id, foodEntity);
    }

    @RequestMapping(value = "/addUser")
    String addUser(@RequestBody UserEntity userEntity) {
        return userService.addUser(userEntity);
    }

    @RequestMapping("/")
    @ResponseBody
    ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }


}
