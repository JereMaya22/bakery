package com.paning.getusers.service;

import com.paning.getusers.modeldto.UserShowDato;

import java.util.List;

public interface IUserService {
    List<UserShowDato> getAllUsers();
}
