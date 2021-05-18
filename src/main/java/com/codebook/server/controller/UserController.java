package com.codebook.server.controller;

import com.codebook.server.domain.User;
import com.codebook.server.domain.request.CreateAccountRequest;
import com.codebook.server.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }

    @PostMapping("/new")
    public void createAccountHandler(@RequestBody CreateAccountRequest request) {
        userService.createAccount(request);
    }
}
