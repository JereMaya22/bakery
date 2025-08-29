package com.paning.delet_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paning.delet_user.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

}
