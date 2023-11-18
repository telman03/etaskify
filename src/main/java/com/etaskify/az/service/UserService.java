package com.etaskify.az.service;

import com.etaskify.az.dto.CreateUserRequestDto;
import com.etaskify.az.excepetion.EmailAlreadyUsedException;
import com.etaskify.az.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import com.etaskify.az.repository.UserRepository;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void register(CreateUserRequestDto dto) {
        userRepository.findByEmail(dto.getEmail())
                .ifPresent(user -> {
                    throw new EmailAlreadyUsedException("Email already used");
                });
        User user = createUserEntity(dto);
        userRepository.save(user);
    }

    private User createUserEntity(CreateUserRequestDto dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        return user;
    }


}
