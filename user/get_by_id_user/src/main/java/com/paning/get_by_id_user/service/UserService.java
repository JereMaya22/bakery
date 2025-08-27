package com.paning.get_by_id_user.service;

import org.springframework.stereotype.Service;

import com.paning.get_by_id_user.model.User;
import com.paning.get_by_id_user.modelDto.ShowUser;
import com.paning.get_by_id_user.repository.IUserRepository;

@Service
public class UserService implements IUserService{

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    private ShowUser mapShowUser(User user){
        return new ShowUser(user.getId(), user.getName());
    }

    @Override
    public ShowUser getByIdUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        return mapShowUser(user);
    }

}
