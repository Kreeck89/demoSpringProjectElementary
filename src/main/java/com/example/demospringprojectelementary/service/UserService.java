package com.example.demospringprojectelementary.service;

import com.example.demospringprojectelementary.entity.User;
//import com.example.demospringprojectelementary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

//    @Autowired
//    private final UserRepository userRepository;
//
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public List<User> getAll() {
        //some logic....
//        return userRepository.findAll();
        return List.of(new User(1L, "Alex", "Bob", 15),
                new User(2L, "Alex", "Bob", 20),
                new User(3L, "Alex", "Bob", 35));
    }

    public User getById(Long id) {
        return new User(2L, "Alex", "Bob", 20);
    }
}
