package com.paning.get_by_id_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paning.get_by_id_user.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long>{

}
