package com.paning.getusers.service;

import com.paning.getusers.model.User;
import com.paning.getusers.modeldto.UserShowDato;
import com.paning.getusers.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserShowDato convertToUserShowDato(User user) {
        return new UserShowDato(user.getId(), user.getName());
    }

    @Override
    public List<UserShowDato> getAllUsers() {
        return userRepository.findAll().stream().map(this::convertToUserShowDato).toList();
    }
}
