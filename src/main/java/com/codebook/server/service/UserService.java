package com.codebook.server.service;

import com.codebook.server.domain.User;
import com.codebook.server.domain.request.CreateAccountRequest;
import com.codebook.server.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(
            UserRepository repository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public void createAccount(CreateAccountRequest request) {
        User user = User.builder()
                .password(passwordEncoder.encode(request.getPassword()))
                .username(request.getUsername())
                .email(request.getEmail())
                .build();

        log.info("Creating a new user {}", user);
        userRepository.save(user);
    }
}
