package com.etaskify.az.controller;

import com.etaskify.az.dto.CreateUserRequestDto;
import com.etaskify.az.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;


    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody CreateUserRequestDto dto) {
        userService.register(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
