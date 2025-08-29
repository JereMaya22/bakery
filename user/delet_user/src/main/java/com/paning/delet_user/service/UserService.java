package com.paning.delet_user.service;

import org.springframework.stereotype.Service;

import com.paning.delet_user.repository.UserRespository;

@Service
public class UserService implements IUserService{

    private final UserRespository userRespository;

    public UserService(UserRespository userRespository){
        this.userRespository = userRespository;
    }

    @Override
    public Void deletUser(Long id) {
        userRespository.deleteById(id);
        return null;
    }

}
