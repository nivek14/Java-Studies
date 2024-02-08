package com.example.SoftBlues.controllers;

import com.example.SoftBlues.domain.user.User;
import com.example.SoftBlues.domain.user.UserRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity getAllUsers(){
        var allUsers = userRepository.findAll();
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Iterable<User> getByName(@PathVariable String name){
        return userRepository.findByName(name);
    }

    @GetMapping
    public Iterable<User> getByUserName(@PathVariable String userName){
        return  userRepository.findByUsername(userName);
    }

    @PostMapping
    public ResponseEntity registerNewUser(@Valid User user){
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity updateUser(@Valid User user){
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if(optionalUser.isPresent()){
            userRepository.save(user);
            return ResponseEntity.ok().build();
        }
        else return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity deleteUser(@Valid User user){
        userRepository.deleteById(user.getId());
        return ResponseEntity.ok().build();
    }
    
}
