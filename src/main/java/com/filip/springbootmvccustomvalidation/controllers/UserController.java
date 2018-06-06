package com.filip.springbootmvccustomvalidation.controllers;

import com.filip.springbootmvccustomvalidation.models.User;
import com.filip.springbootmvccustomvalidation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void register(@RequestBody @Valid User user) {
        userRepository.save(user);
    }

}
