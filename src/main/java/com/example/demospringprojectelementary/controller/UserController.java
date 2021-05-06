package com.example.demospringprojectelementary.controller;

import com.example.demospringprojectelementary.entity.User;
import com.example.demospringprojectelementary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
//    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    //    @GetMapping(path = "/{id}")
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }
}
