package io.reflectoring.demo_mongo_app.controller;

import io.reflectoring.demo_mongo_app.model.User;
import io.reflectoring.demo_mongo_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable String id){
        userService.deleteUser(id);
    }


}
