package com.paning.createuser.service;

import com.paning.createuser.model.User;
import com.paning.createuser.modeldto.UserCreateDto;
import com.paning.createuser.repository.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    private User convertToModel(UserCreateDto userCreateDto){
        User user = new User();
        user.setName(userCreateDto.getName());
        user.setPassword(userCreateDto.getPassword());

        return user;
    }

    @Override
    public void createUser(UserCreateDto userCreateDto) {
        User user = convertToModel(userCreateDto);
        userRepository.save(user);
    }
}
