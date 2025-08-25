package com.paning.createuser.repository;

import com.paning.createuser.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    public Optional<User> findByName(String name);
}
